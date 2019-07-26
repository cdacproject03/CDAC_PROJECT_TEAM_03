$(document).ready(function() { 
$('#form').submit(function(e) {
    var name = $('#name').val();
    var password = $('#password').val();
    var select = $('#select').val();
    var cnf_pwd=$('#cnf_pwd').val();

    $(".error").remove();
     if (select == 'select') {
    	e.preventDefault();
    	$('#select').after('<span class="error">Select your Role</span>');
    }
    if(cnf_pwd!=password)
    	{
    	e.preventDefault();
        $('#cnf_pwd').after('<span class="error">Password miss match</span>');
    	}
    if (name.length < 1) {
    	e.preventDefault();
      $('#name').after('<span class="error">This field is required</span>');
    }
    if (password.length < 1) {
    	e.preventDefault();
      $('#password').after('<span class="error">This field is required</span>');
    }
  });
 
});