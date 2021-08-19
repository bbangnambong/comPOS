
$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (vga, status) {
            $('#idEdit').val(vga.id);
            $('#ddlVgaChipsetEdit').val(vga.vgachipsetid);
            $('#nameEdit').val(vga.name);
            $('#priceEdit').val(vga.price);
            $('#detailsEdit').val(vga.details);
        });

        $('#editModal').modal();
    });
    $('table #detailsButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (vga, status) {
            $('#nameDetails').val(vga.name);
            $('#priceDetails').val(vga.price);
            $('#detailsDetails').val(vga.details);
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
