
$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (motherboard, status) {
            $('#idEdit').val(motherboard.id);
            $('#ddlChipsetEdit').val(motherboard.chipsetid);
            $('#ddlSocketEdit').val(motherboard.socketid);
            $('#nameEdit').val(motherboard.name);
            $('#priceEdit').val(motherboard.price);
            $('#detailsEdit').val(motherboard.details);
        });

        $('#editModal').modal();
    });
    $('table #detailsButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (motherboard, status) {
            $('#nameDetails').val(motherboard.name);
            $('#priceDetails').val(motherboard.price);
            $('#detailsDetails').val(motherboard.details);
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
