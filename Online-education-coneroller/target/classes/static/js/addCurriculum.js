$(function() {
				$("#stytems").click(function() {
					var val = $("#stytemMake").val();
					var tr = "<tr><td>章节名称</td><td><input type='text' name='stytems[" + (parseInt(val)+1) +
						"].curriculumSystemName' /></td></tr><tr><td>节数</td>" +
						"<td><input type='text' name='stytems[" + (parseInt(val)+1) +
						"].curriculumSystemSequence' /></td></tr><tr class='layui-collapse'>" +
						"<td colspan='2' class='layui-colla-item'><h2 class='layui-colla-title'>章节详情</h2><div class='layui-colla-content'>" +
						"<table class='layui-table'><tbody class='layui-table-body'><tr><td>小节名称</td><td><input type='text' name='stytems["+(parseInt(val)+1)+"].details[0].curriculumDetailsName' /></td></tr><tr><td>直播时间</td><td><div class='layui-input-inline'><input type='text' class='layui-input' name='stytems["+(parseInt(val)+1)+"].details[0].curriculumDetailsTime' placeholder='yyyy-MM-dd HH:mm:ss'></div></td></tr></tbody></table>" +
						"<button name='details' onclick='detaclick(this)' class='layui-btn layui-btn-fluid'>新增一行</button><input type='hidden' value='1' /></div></td></tr>";
					$("#stytem").append(tr);
					$("#stytemMake").val(parseInt(val) + 1);
					layui.element.render();
				});
			});
			function detaclick(i) {
				var val = $(i).prev();
				var index = $(i).next().val();
				var vals = $("#stytemMake").val();
				var tr ="<tr><td colspan='2'><hr class='layui-bg-green' /></td></tr><tr><td>小节名称</td><td><input type='text' name='stytems["+parseInt(vals)+"].details["+parseInt(index)+"].curriculumDetailsName' /></td></tr><tr><td>直播时间</td><td><input type='text' class='layui-input' name='stytems["+parseInt(vals)+"].details["+parseInt(index)+"].curriculumDetailsTime' placeholder='yyyy-MM-dd HH:mm:ss'></td></tr>";
				$(i).next().val(parseInt(index)+1);
				val.append(tr);
			}
			layui.use(['element', 'layer'], function() {
				var element = layui.element;
				var layer = layui.layer;
				//监听折叠
				element.on('collapse(test)', function(data) {
					layer.msg('展开状态：' + data.show);
				});
			});
			function qing(){
				$("label").css("display","none");
				$("input").css("display","block");
			}