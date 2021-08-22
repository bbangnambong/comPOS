
$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (selling, status) {
            $('#idEdit').val(selling.id);
            $('#marketEdit').val(selling.market);
            $('#nameEdit').val(selling.name);
            $('#phoneEdit').val(selling.phone);
            $('#priceEdit').val(selling.price);
            $('#detailsEdit').val(selling.details);
            $('#addedDateEdit').val(selling.addedDate);
        });

        $('#editModal').modal();
    });
    $('table #sellingButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (selling, status) {
            $('#idSelling').val(selling.id);
            $('#marketSelling').val(selling.market);
            $('#nameSelling').val(selling.name);
            $('#phoneSelling').val(selling.phone);
            $('#priceSelling').val(selling.price);
            $('#detailsSelling').val(selling.details);
            $('#addedDateSelling').val(selling.addedDate);
        });

        $('#sellingModal').modal();
    });
    $('table #deleteButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#confirmDeleteButton').attr('href', href);

        $('#deleteModal').modal();
    });

});
