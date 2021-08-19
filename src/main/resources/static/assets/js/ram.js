
$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (ram, status) {
            $('#idEdit').val(ram.id);
            $('#ddlDdrEdit').val(ram.ddrid);
            $('#ddlVolEdit').val(ram.volid);
            $('#nameEdit').val(ram.name);
            $('#priceEdit').val(ram.price);
            $('#detailsEdit').val(ram.details);
        });

        $('#editModal').modal();
    });
    $('table #detailsButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (ram, status) {
            $('#nameDetails').val(ram.name);
            $('#priceDetails').val(ram.price);
            $('#detailsDetails').val(ram.details);
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
