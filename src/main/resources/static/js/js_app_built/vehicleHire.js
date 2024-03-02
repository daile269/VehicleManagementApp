$('document').ready(function (){

    $('table #editBtn').on('click',function (event){
         event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (item,status){
            $('#edit_id').val(item.id);
            $('#edit_price').val(item.price);
            $('#edit_remarks').val(item.remarks);
            $('#edit_dateIn').val(item.dateIn.substr(0,10));
            $('#edit_dateOut').val(item.dateOut.substr(0,10));
            $('#edit_timeIn').val(item.timeIn);
            $('#edit_timeOut').val(item.timeOut);
            $('#edit_vehicle').val(item.vehicleId);
            $('#edit_client').val(item.clientId);
            $('#edit_location').val(item.locationId);

        })

          $('#editModal').modal();
    })
    $('table #detailsBtn').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(item, status){
            $('#idDetails').val(item.id);
            $('#priceDetails').val(item.price);
            $('#remarksDetails').val(item.remarks);
            $('#dateInDetails').val(item.dateIn.substr(0,10));
            $('#dateOutDetails').val(item.dateOut.substr(0,10));
            $('#timeInDetails').val(item.timeIn);
            $('#timeOutDetails').val(item.timeOut);
            $('#vehicleDetails').val(item.vehicleId);
            $('#clientDetails').val(item.clientId);
            $('#locationDetails').val(item.locationId);
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