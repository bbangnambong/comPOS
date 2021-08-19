
$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (cpu, status) {
            $('#idEdit').val(cpu.id);
            $('#ddlBrandEdit').val(cpu.brandid);
            $('#ddlSocketEdit').val(cpu.socketid);
            $('#nameEdit').val(cpu.name);
            $('#priceEdit').val(cpu.price);
            $('#detailsEdit').val(cpu.details);
        });

        $('#editModal').modal();
    });
    $('table #detailsButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (cpu, status) {
            $('#nameDetails').val(cpu.name);
            $('#priceDetails').val(cpu.price);
            $('#detailsDetails').val(cpu.details);
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
