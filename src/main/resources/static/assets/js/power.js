
$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (power, status) {
            $('#idEdit').val(power.id);
            $('#wattEdit').val(power.watt);
            $('#nameEdit').val(power.name);
            $('#priceEdit').val(power.price);
            $('#detailsEdit').val(power.details);
        });

        $('#editModal').modal();
    });
    $('table #detailsButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (power, status) {
            $('#nameDetails').val(power.name);
            $('#priceDetails').val(power.price);
            $('#detailsDetails').val(power.details);
        });

        $('#detailsModal').modal();
    });
    $('table #deleteButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#confirmDeleteButton').attr('href', href);

        $('#deleteModal').modal();
    });

});
