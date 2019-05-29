layui.use('element', function(){
    var element = layui.element;
    var layer = layui.layer;

	var active = {
            tabAdd: function (url, id,title) {
                //新增一个Tab项
                element.tabAdd('demo', {
                    title: title
                  , content: '<iframe data-frameid="'+id+'" frameborder="0" name="content" scrolling="no" width="100%" src="' + url + '"></iframe>'
                  , id: id //实际使用一般是规定好的id，这里以时间戳模拟下
                })
                FrameWH();//计算框架高度
            }
          , tabChange: function (id) {
              //切换到指定Tab项
              element.tabChange('demo', id); //切换到：用户管理
              $("iframe[data-frameid='"+id+"']").attr("src",$("iframe[data-frameid='"+id+"']").attr("src"))//切换后刷新框架
          }
            , tabDelete: function (id) {
                element.tabDelete("demo", id);//删除
            }
            , tabDeleteAll: function (ids) {//删除所有
                $.each(ids, function (i,item) {
                    element.tabDelete("demo", item);
                })
            }
        };
		
			
		$(".side-active").click(function () {
	        var dataid = $(this);
	        if ($(".layui-tab-title li[lay-id]").length <= 0) {
	            active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"),dataid.attr("data-title"));
	        } else {
	            var isData = false;
	            $.each($(".layui-tab-title li[lay-id]"), function () {
	                if ($(this).attr("lay-id") == dataid.attr("data-id")) {
	                    isData = true;
	                }
	            })
	            if (isData == false) {
	                active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"),dataid.attr("data-title"));
	            }
	        }
	        active.tabChange(dataid.attr("data-id"));
	    })
	    
	   $(function(){
		   $("#health").click();
	   })
	    
	    function FrameWH() {
            var h = $(window).height() -41- 10 - 60 -10-44 -10;
            $("iframe").css("height",h+"px");
        }

        $(window).resize(function () {
            FrameWH();
        })
	});