
$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (accessory, status) {
            $('#idEdit').val(accessory.id);
            $('#sortEdit').val(accessory.sort);
            $('#nameEdit').val(accessory.name);
            $('#priceEdit').val(accessory.price);
            $('#detailsEdit').val(accessory.details);
        });

        $('#editModal').modal();
    });
    $('table #detailsButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (accessory, status) {
            $('#sortDetails').val(accessory.sort);
            $('#nameDetails').val(accessory.name);
            $('#priceDetails').val(accessory.price);
            $('#detailsDetails').val(accessory.details);
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
