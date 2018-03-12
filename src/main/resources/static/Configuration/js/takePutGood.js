$(function(){
//	新建出口
	$(".config_add").click(function(){
		$(".zhezhao").addClass("block").removeClass("none");
	});
//取消
	$(".takeput_button_no").click(function(){
		$(".zhezhao").addClass("none").removeClass("block");
	});
//确认
	$(".takeput_button_ok").click(function(){
		
	});
//叉叉关闭
	$(".takeput_close").click(function(){
		$(".zhezhao").addClass("none").removeClass("block");
	});
	
	//修改出口
	$(".config_alert").click(function(){
		var doc = document.documentElement;  
		var relHeight = (doc.clientHeight > doc.scrollHeight) ? doc.clientHeight : doc.scrollHeight;//获取屏幕高度和当前页面高度中的较大值  
		document.getElementById('zhezhao').style.height = relHeight+'px';//id为about_zhezhao的div就是我页面中的遮罩层 
		$(".zhezhao").addClass("block").removeClass("none");
		$(".export_tan_").text("修改");
	});
	
	//禁用或启用
	$(".config_disable").unbind().click(function(){
		var isUsed = "1";//默认启用
		if($(this).text() == "禁用"){
			$(this).text("启用");
			//isUsed = "0";//禁用
		}else{
			$(this).text("禁用");
		};
		});

});

//拼接列表
function takePut(){
	$("#takePut_ul_id").append('<li class="config_message_table_content">'
			+'<div><span class="ml30">出口1</span></div>'
		    +'<div>取货台</div>'
		    +'<div>12</div>'
		    +'<div>10</div>'
		    +'<div>8</div>'
			+'<div>'
				+'<img class="config_table_diss ml5" src="../image/diss.png"/>'
				+'<img class="config_table_start none ml5" src="../image/start.png"/>'
			+'</div>'
			+'<div><a title="1出口、2出口、3出口、4出口、5出口">1出口、2出口...</a></div>'
			+'<div>2018/1/8 12:53</div>'
			+'<div style="color: #078fff;" class="cursor">'
				+'<span style="color: #078fff;" class="fl config_disable">禁用</span>'
				+'<span style="color: #078fff;" class="fl config_alert ml20">修改</span>'
			+'</div>'
		+'</li>');
}

//新增验证takeput_form
$('#takeput_form').bootstrapValidator({
	container: 'tooltip',
	feedbackIcons: {
		valid: 'glyphicon glyphicon-ok',
		invalid: 'glyphicon glyphicon-remove',
		validating: 'glyphicon glyphicon-refresh'
	},
	fields : {
		//名称
		takeputName : {
			validators : {
				notEmpty : {
					message : '名称不能为空!'
				},

				stringLength : {
					min : 1,
					max : 30,
					message : '名称长度不能超过30！'
				}
			}
		},
		//类型
		takeGood : {
			validators : {
				notEmpty : {
					message : '类型不能为空!'
				},

				stringLength : {
					min : 1,
					max : 20,
					message : '类型长度不能超过20！'
				}
			}
		},
		//所在行
		takeputRow : {
			validators : {
				notEmpty : {
					message : '所在行值不能为空!'
				},

				stringLength : {
					min : 1,
					max : 10,
					message : '负责人长度不能超过10！'
				}
			}
		},
		//所在层
		plceHeight : {
			validators : {
				notEmpty : {
					message : '所在层值不能为空!'
				},
//				regexp : {
//					regexp : /^[0-9]$/,
//					message : '请输入正确格式的联系电话！'
//				},
			}
		},

		//所在列
		colum: {
			threshold : 2 ,
			validators : {
				notEmpty : {
					message : '所在列值不能为空！'
				},
				regexp: {
					regexp: /^([1-9]|[1-4][0-9])$/,
					message: '请输入1到49之间的数字！'
				},
//				remote: {//ajax验证。server result:{"valid",true or false} 向服务发送当前input name值，获得一个json数据。例表示正确：{"valid",true}  
//					url: '../createStoreHouse/checkAreaNameExist',//验证地址      
//					dataType: "json",
//					data:{areaName:function(){return $("#areaNameEditId").val()}
//					},
//					message: '区位已存在！',//提示消息
//					delay :  2000,//每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大）
//					type: 'POST'//请求方式
//				}
//			}
		},
		//关联出口
		takeGood: {
			validators : {
				notEmpty : {
					message : '关联出口不能为空!'
				},

//				regexp: {
//					regexp: /^([1-9]|[1-4][0-9])$/,
//					message: '请输入1到49之间的数字！'
//				}
//			}
		},
		
		}
		}

	}
}).on('success.form.bv', function(e) {
	e.preventDefault();
	var $form = $(e.target);
	var bv = $form.data("bootstrapValidator");
});
