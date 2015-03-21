jQuery(function(){
	/*
	 * 导航条
	 * */
	var site_url = window.location.href.toLowerCase();
	switch (true) {
		default :
			jQuery("#nav li").attr("class","");
			jQuery("#nav li").eq(0).attr("class","nav_lishw");
			jQuery(".nav_lishw .v a").attr("class","sele");
			jQuery(".nav_lishw .kind_menu").show();
	}
	jQuery("#nav li").hover(
		function(){
			clearTimeout(setTimeout("0")-1);
			jQuery("#nav .kind_menu").hide();
			jQuery("#nav li .v .sele").attr("class","shutAhover");
			jQuery(this).attr("id","nav_hover")
			jQuery("#nav_hover .v a").attr("class","sele");
			jQuery("#nav_hover .kind_menu").show();
		},
		function(){
			if(jQuery(this).attr("class") != "nav_lishw"){
				jQuery("#nav_hover .v .sele").attr("class","");
				jQuery("#nav_hover .kind_menu").hide();
			}
			jQuery(this).attr("id","")
			jQuery("#nav li .v .shutAhover").attr("class","sele");
			setTimeout(function(){
				jQuery(".nav_lishw .kind_menu").show();
				jQuery(".nav_lishw .v a").attr("class","sele");
			},50);
		}
	);
	
	/**
	 * 自定义
	 */
	
});

