//WRITE YOUR JQUERY CODE HERE

$('#signup_div').css('visibility', 'hidden');
$('#login_div').css('visibility', 'hidden');

$('#login').click(function () {
    $('#login_div').css('visibility', 'visible');
$('#signup_div').css('visibility', 'hidden');
});

$('#signup').click(function () {
    $('#login_div').css('visibility', 'hidden');
    $('#signup_div').css('visibility', 'visible');
});