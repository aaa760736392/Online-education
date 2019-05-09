/* 轮播图 */
			layui.use(['carousel', 'form'], function() {
				var carousel = layui.carousel,
					form = layui.form;
				//常规轮播
				carousel.render({
					elem: '#test1',
					arrow: 'always',
					width: '60%',
					height: '380px'
				});
				var $ = layui.$,
					active = {
						set: function(othis) {
							var THIS = 'layui-bg-normal',
								key = othis.data('key'),
								options = {};

							othis.css('background-color', '#5FB878').siblings().removeAttr('style');
							options[key] = othis.data('value');
							ins3.reload(options);
						}
					};
				//监听开关
				form.on('switch(autoplay)', function() {
					ins3.reload({
						autoplay: this.checked
					});
				});
				$('.demoSet').on('keyup', function() {
					var value = this.value,
						options = {};
					if (!/^\d+$/.test(value)) return;
					options[this.name] = value;
					ins3.reload(options);
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
									id: 'LAY_layuiprs', //设定一个id，防止重复弹出
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