$(".windup-download-now").click(function() {
    window.location = 'https://repository.jboss.org/nexus/service/local/artifact/maven/redirect?r=releases&g=org.jboss.windup&a=windup-distribution&v=2.3.0.Final&e=zip&c=offline'
});

$.extend($.expr[':'], {
    contents: function(elem, i, attr){
      return $(elem).contents().find( attr[3] );
    }
});  


// By Chris Coyier & tweaked by Mathias Bynens 
// Enhanced by Brad Davis.
/* Resize the youtube videos based on fluid. */
$(function() {

	// Find all YouTube videos
	var $allVideos = $("iframe[src^='http://www.youtube.com']"),

	// The element that is fluid width
	$fluidEl = $("body");

	// Figure out and save aspect ratio for each video
	$allVideos.each(function() {

		$(this)
			.data('aspectRatio', this.height / this.width)
			
			// and remove the hard coded width/height
			.removeAttr('height')
			.removeAttr('width');

	});

	// When the window is resized
	// (You'll probably want to debounce this)
	$(window).resize(function() {

		// Resize all videos according to their own aspect ratio
		$allVideos.each(function() {
			var newWidth = $(this).parent().width() -10;

			var $el = $(this);
			$el
				.width(newWidth)
				.height(newWidth * $el.data('aspectRatio'));

		});

	// Kick off one resize to fix all videos on page load
	}).resize();

});
