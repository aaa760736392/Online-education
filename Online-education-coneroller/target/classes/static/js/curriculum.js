layui.use('element', function(){
  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  //监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});

layui.use('laypage', function(){
var laypage = layui.laypage;

  //执行一个laypage实例
  laypage.render({
   elem: 'page' //注意，这里的 test1 是 ID，不用加 # 号
   ,count: 50 //数据总数，从服务端得到
  });
});
layui.use('layer', function() { //独立版的layer无需执行这一句
						var $ = layui.jquery,
							layer = layui.layer; //独立版的layer无需执行这一句

						var active = {
							notice: function() {
								//示范一个公告层
								layer.open({
									type: 1,
									title: '会员登录', //不显示标题栏
									closeBtn: false,
									area: '300px;',
									shade: 0.8,
									id: 'LAY_layuipro', //设定一个id，防止重复弹出
									btn: ['登录', '注册'],
									btnAlign: 'c',
									moveType: 1 ,//拖拽模式，0或者1
									content: '<table><tr><td>账号：</td><td><input type="text"></td></tr></table>',
									success: function(layero) {
										var btn = layero.find('.layui-layer-btn');
										btn.find('.layui-layer-btn0').attr({
											
										});
									}
								});
								},
							register:function(){
								layer.open({
									type: 1,
									title: '会员注册', //不显示标题栏
									closeBtn: false,
									area: '300px;',
									shade: 0.8,
									id: 'LAY_layuipro', //设定一个id，防止重复弹出
									btn: ['登录', '注册'],
									btnAlign: 'c',
									moveType: 1 ,//拖拽模式，0或者1
									content: '',
									success: function(layero) {
										var btn = layero.find('.layui-layer-btn');
										btn.find('.layui-layer-btn0').attr({
											href: 'http://www.layui.com/',
											target: '_blank'
										});
									}
								});
								
							}
							}

							$('#layerDemo .layui-btn').on('click', function() {
								var othis = $(this),
									method = othis.data('method');
								active[method] ? active[method].call(this, othis) : '';
							});
						});
