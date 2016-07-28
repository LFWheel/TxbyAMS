<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="boots/css/bootstrap.min.css" rel="stylesheet">
 <!-- MetisMenu CSS -->
    <link href="metisMenu/dist/metisMenu.min.css" rel="stylesheet">
<!-- Custom CSS -->
    <link href="static/css/sb-admin-2.css" rel="stylesheet">
  <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <style type="text/css">
    #apiTable{
    margin-top:20px;
    text-align: left;
    width:800px;
    border-collapse:separate;
    border-spacing:10px;
    }
    </style>
</head>
<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">天下布医AMS</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Read All Messages</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-tasks fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 1</strong>
                                        <span class="pull-right text-muted">40% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 2</strong>
                                        <span class="pull-right text-muted">20% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                            <span class="sr-only">20% Complete</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 3</strong>
                                        <span class="pull-right text-muted">60% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 4</strong>
                                        <span class="pull-right text-muted">80% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete (danger)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Tasks</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-tasks -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-comment fa-fw"></i> New Comment
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                    <span class="pull-right text-muted small">12 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> Message Sent
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-tasks fa-fw"></i> New Task
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Alerts</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-alerts -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                        <li>
                            <a href="main.jsp"><i class="fa fa-dashboard fa-fw"></i> 快速测试</a>
                        </li>
                        <li>
                            <a href="api_manage.jsp"><i class="fa fa-dashboard fa-fw"></i> API管理</a>
                        </li>
                        <li id="toAll">
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> 我的API<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <div id="tree"></div>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>                                            
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
        <div id="api_all_container">

				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#detail"
						aria-controls="home" role="tab" data-toggle="tab">详情</a></li>
					<li role="presentation"><a href="#other"
						aria-controls="profile" role="tab" data-toggle="tab">其他 </a></li>
				</ul>

				<!-- Tab panes -->
				<div class="tab-content">
					<div role="tabpanel" class="tab-pane active" id="detail">
						<div id="click_tip" class="alert alert-success" style="margin-top: 20px" role="alert"><strong>点击</strong>一个API以查看它的详细信息哦！</div>
						<p id="apiName"></p>
						<table id="detailTable"
								class="table table-bordered table-condensed">
								<caption>
									参数列表								
								</caption>
								<thead>
									<tr>
										<th>参数名</th>
										<th>参数类型</th>
										<th>参数说明</th>
									</tr>
								</thead>
								<tbody>
									
								</tbody>
							</table>
					</div>
					<div role="tabpanel" class="tab-pane" id="other">
						
					</div>		
				</div>

			</div>
			
			<div id="api_manage_container">
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#home"
						aria-controls="home" role="tab" data-toggle="tab">创建目录</a></li>
					<li role="presentation"><a href="#profile"
						aria-controls="profile" role="tab" data-toggle="tab">添加API</a></li>
				</ul>

				<!-- Tab panes -->
				<div class="tab-content">
					<div role="tabpanel" class="tab-pane active" id="home">
						<form class="form-horizontal" id="dirForm" >
							<div class="form-group">
								<label for="" class="col-sm-2 control-label">父目录名(不选则是根目录)</label>
								<div class="col-sm-10">
									<select id="parentId" name="parentId" class="form-control">
                                      <option value="id">parentDir</option>
                                      <option value="hospital">hospital</option>
                                      <option value="doctor">doctor</option>
                                    </select>
								</div>
							</div>
							<div class="form-group">
								<label for="dirName" class="col-sm-2 control-label">目录名</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="dirName" name="dirName"
										placeholder="目录名">
								</div>
							</div>					
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="button" id="addDir" class="btn btn-success">提交</button>
								</div>
							</div>
						</form>
					</div>
					<div role="tabpanel" class="tab-pane" id="profile">
					<form id="apiForm" >
							<table id="apiTable">
							<caption>基本参数</caption>
							<tr><td>目录名</td><td><select id="apiDirId" name="dirId" class="form-control">                            
                                    </select></td></tr>
                            <tr><td>URL</td><td><input type="text" class="form-control" id="url" name="url"
										placeholder="接口地址"></td></tr>
							</table>					
							
						</form>
						<table id="paramTable"
								class="table table-bordered table-condensed">
								<caption>
									本接口参数列表
									<button id="addParam" class="btn btn-primary">添加参数</button>
								</caption>
								<thead>
									<tr>
										<th>参数名</th>
										<th>参数类型</th>
										<th>参数说明</th>
									</tr>
								</thead>
								<tbody>
									
								</tbody>
							</table>
							<button type="button" id="addApi" class="btn btn-success">提交</button>							
					</div>		
				</div>

			</div>
		</div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
<!-- 添加参数modal -->
<div class="modal fade" id="paramModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">Add Param</h4>
      </div>
      <div class="modal-body">
        <form>
          <div class="form-group">
            <label for="recipient-name" class="control-label">参数名:</label>
            <input type="text" class="form-control" id="param-name">
          </div>
          <div class="form-group">
            <label for="message-text" class="control-label">参数类型:</label>
            <!-- <input type="text" class="form-control" id="param-type"> -->
            <select id="param-type" class="form-control">
                <option value="int">Int</option>
                <option value="double">Double</option>
                <option value="String">String</option>
            </select>
          </div>
          <div class="form-group">
            <label for="message-text" class="control-label">参数说明:</label>
            <input type="text" class="form-control" id="param-remark">
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-primary" id="ok">确定</button>
      </div>
    </div>
  </div>
</div>

    <!-- jQuery -->
    <script src="jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="boots/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="metisMenu/dist/metisMenu.min.js"></script>


    <!-- Custom Theme JavaScript -->
    <script src="static/js/sb-admin-2.js"></script>
    <script src="static/js/bootstrap-treeview.min.js"></script>
    <script src="static/js/my.js"></script>
    <script type="text/javascript">
    
	$(document).ready(function(){
		loadTreeView();
		$("#api_all_container").hide();
		
		$('#addDir').on('click',function(){
			var formData = $("#dirForm").serialize();
			$.ajax({
				type:'POST',
				url:'AddDirServlet',
				dataType:'json',
				data:formData,
				success:function(data,textStatus){
					if(data.status=="ok"){
						loadTreeView();
					}
				}
			});
		});
  
		$('#addApi').on('click',function(){
			var tableData = getTableData("#paramTable");
			var data = {};
			var formData = $('#apiForm').serializeArray();
			$.each(formData,function(){
				data[this.name]=this.value;
			});
			data.params = tableData;
			$.ajax({
				type:'POST',
				url:'AddApiServlet',
				dataType:'json',
				contentType:"application/json;charset=utf-8",
				data:JSON.stringify(data),
				success:function(data,textStatus){
					loadTreeView();
				}
			});
			
		});
		
		
		$('#addParam').on('click',function(){
			$('#apiForm').submit(function(e){
				e.preventDefault();
			});
			$('#paramModal').modal('show');
		});
		
		$('#paramModal').on('show.bs.modal',function(){
			$('#param-name').val('');
			$('#param-type').val('');
			$('#param-remark').val('');
		});
		
		$('#ok').on('click',function(){
			var pname = $('#param-name').val();
			var ptype = $('#param-type').val();
			var premark = $('#param-remark').val();
		//	var appendhtml = "<tr><td>"+pname+"</td><td><input type=\"text\" class=\"form-control\" name=\""+pname+"\""+" value=\""+pvalue+"\"/></td></tr>";
			var appendhtml = "<tr>"+"<td><input type=\"text\" class=\"form-control\" name=\"paramName\""+" value=\""+pname+"\"/></td>"+
			"<td><input type=\"text\" class=\"form-control\" name=\"paramType\""+" value=\""+ptype+"\"/></td>"+
			"<td><input type=\"text\" class=\"form-control\" name=\"remark\""+" value=\""+premark+"\"/></td>"+"</tr>";
			$('#paramTable').append(appendhtml);
			$('#paramModal').modal('hide');
		});
		ajaxAddOptions("GetAllDir", $("#parentId"), "dirId", "dirName");  
		ajaxAddOptions("GetAllDir", $("#apiDirId"), "dirId", "dirName");
		
		$("#toAll").on('click',function(){		
			$("#api_manage_container").hide();
			$("#api_all_container").show();
		});
	});
	
	function ajaxAddOptions(url, target, id, text){  
	    target.empty();  
	    $.getJSON(url, function(json){  
	        $(json).each(function(i){  
	            var x = json[i];  
	            target.append("<option value='" + eval("x." + id) + "'>" + eval("x." + text) + "</option>" );  
	        });  
	    });  
	}
	
	function loadTreeView(){
		$.ajax({
			type:'POST',
			url:'AllApiServlet',
			dataType:'json',
			async:'false',
			success:function(data,textStatus){
				//alert(data);
				$('#tree').treeview({color: "#428bca",
			          //enableLinks: true,
			          onNodeSelected: function(event, node) {
			             //alert(node.href);
			             if(node.href){
			            	 $.ajax({
			         			type:'POST',
			         			url:'GetOneApi',
			         			dataType:'json',
			         			data:{apiId:node.href},
			         			async:'false',
			         			success:function(data,textStatus){
			         				//alert(data);
			         				$('#click_tip').hide();
			         				$('#apiName').text("接口地址:"+data.url);
			         				$('#detailTable tbody').empty();
			         				$.each(data.params,function(){
			         					var appendhtml = "<tr><td>"+this.paramName+"</td>"+
			         					"<td>"+this.paramType+"</td>"+
			         					"<td>"+this.remark+"</td>"+"</tr>";
			         					$('#detailTable').append(appendhtml);
			         				});
			         			}
			         		});
			             }
			            },
			          data: data});
			}
		});
	}
	
	//table数据转json数组
	function getTableData(tableId){
		var data = [];
		$(tableId).find("tbody tr").each(function(){  
			var obj = {};
			$(this).find("input").each(function(){  
			obj[$(this).attr('name')]=$(this).val();  
			});  
			data.push(obj);
			});  
		return data;
	}
	</script>
</body>
</html>