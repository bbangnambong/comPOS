
$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (ssdhdd, status) {
            $('#idEdit').val(ssdhdd.id);
            $('#ddlFormatEdit').val(ssdhdd.formatid);
            $('#ddlSsdVolEdit').val(ssdhdd.ssdvolid);
            $('#nameEdit').val(ssdhdd.name);
            $('#priceEdit').val(ssdhdd.price);
            $('#detailsEdit').val(ssdhdd.details);
        });

        $('#editModal').modal();
    });
    $('table #detailsButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (ssdhdd, status) {
            $('#nameDetails').val(ssdhdd.name);
            $('#priceDetails').val(ssdhdd.price);
            $('#detailsDetails').val(ssdhdd.details);
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
