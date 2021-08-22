
$('document').ready(function () {

    $('table #ramButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (rams, status) {
            $('#ramList').val(rams);
        });

        $('#ramModal').modal();
    });

});
