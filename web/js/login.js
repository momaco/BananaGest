
//Al cargar la pagina
$(window).on("load", function ()
{
    $.ajax(
    {
        type: 'post',
        url: 'LoadUsers',
        datatype: 'html'
    });
});

//Al dar click en el boton login
$(document).ready(function () {
    $('#login').click(function () {
        $.ajax(
        {
            type: 'post',
            url: 'LoginControl',
            data:
            {
                user: $('#user').val(),
                password : $('#password').val()
            },
            datatype: 'html',
            success: function (responseText)
            {
                $('#warning').html(responseText); 
            }
        });
    });
});

