$('document').ready(function (){

    $('table #editBtn').on('click',function (event){
         event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (item,status){
            $('#edit_id').val(item.id);
            $('#edit_price').val(item.price);
            $('#edit_remarks').val(item.remarks);
            $('#edit_supplier').val(item.supplierId);
            $('#edit_vehicle').val(item.vehicleId);
            $('#edit_startDate').val(item.startDate.substr(0,10));
            $('#edit_endDate').val(item.endDate.substr(0,10))

        })

          $('#editModal').modal();
    })
    $('table #detailsBtn').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(item, status){
            $('#idDetails').val(item.id);
            $('#priceDetails').val(item.price);
            $("#remarksDetails").val(item.remarks);
            $('#supplierDetails').val(item.supplierId);
            $("#vehicleDetails").val(item.vehicleId);
            $('#endDateDetails').val(item.endDate.substr(0,10));
            $('#startDateDetails').val(item.startDate.substr(0,10));
        });
        $('#detailsModal').modal();
    });

    $('table #deleteBtn').on('click',function (event){
        event.preventDefault();

        var href = $(this).attr('href');

        $('#confirmDeleteBtn').attr('href',href);
        $('#deleteModal').modal();

    })

})