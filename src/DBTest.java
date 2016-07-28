import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;
import com.txbyams.model.Directory;
import com.txbyams.model.MyApi;
import com.txbyams.model.Node;
import com.txbyams.util.DBUtil;
import com.txbyams.util.IDGenerator;


public class DBTest {

	public static void main(String args[]){
	
		//testAdd();
		//testGet();
		//testDir();
		//testQueryDir();
		testDir2node();
	}
	
	public static void testAdd(){
		String id = IDGenerator.getUUID();
		System.out.println(id);
		Directory d = new Directory(id, "ceshfefe");
		MyApi a1 = new MyApi(IDGenerator.getUUID(), "http://test1");
		MyApi a2 = new MyApi(IDGenerator.getUUID(), "http://test2222");
		a1.setDir(d);
		a2.setDir(d);
		List<MyApi> apis = new ArrayList<>();
		apis.add(a2);
		apis.add(a1);
		d.setMyapis(apis);
		
		DBUtil.add(d);
	}
	
	public static void testGet(){
		String sql = "from Directory d";
		Directory d = (Directory)DBUtil.query(sql, null).get(2);
		System.out.println(d.getMyapis().size());
	}
	
	public static void testDir(){
		String id1 = IDGenerator.getUUID();
		Directory d = new Directory(id1,"parentD");
		String id2 = IDGenerator.getUUID();
		String id3 = IDGenerator.getUUID();
		Directory c1 = new Directory(id2,"childD1");
		Directory c2 = new Directory(id3,"childD2");
		c1.setParent(d);
		c2.setParent(d);
		List<Directory> cs = new ArrayList<>();
		cs.add(c2);
		cs.add(c1);
		d.setChildren(cs);
		DBUtil.add(d);
 	}
	
	public static void testQueryDir(){
		List<Directory> dirs = DBUtil.query("from Directory d where d.parentId is null", null);
		System.out.println(dirs.size());
	}
	
	public static void testDir2node(){
		//List<Directory> dirs = DBUtil.query("from Directory d where d.parentId is null", null);
		Session session = DBUtil.getCurrentSession();
		Query q = session.createQuery("from Directory d where d.parentId is null");
		//q.list();
		List<Directory> dirs=q.list();
		List<Node> tree = new ArrayList<>();
		for(Directory d : dirs){
			Node node = dir2Node(d);
			tree.add(node);
		}
		session.close();
		Gson gson = new Gson();
		String jsonStr = gson.toJson(tree);
		System.out.println(jsonStr);
	}
	public static Node dir2Node(Directory dir){
		Node parent = new Node(dir.getDirName(),false);
		List<Directory> children = dir.getChildren();
		List<MyApi> apis = dir.getMyapis();
		if(children==null&&apis==null){
			return parent;
		}else if(children!=null&&apis==null){
			for(Directory d : children){
				parent.addNode(dir2Node(d));
			}
		}else if(children==null&&apis!=null){
			for(MyApi api:apis){
				parent.addNode(api2Node(api));
			}
		}else{
			for(Directory d : children){
				parent.addNode(dir2Node(d));
			}
			for(MyApi api:apis){
				parent.addNode(api2Node(api));
			}
		}
		return parent;
	}
	
	public static Node api2Node(MyApi api){
		Node node = new Node(api.getUrl(),true);
		node.setHref(api.getApiId());
		return node;
	}
}
