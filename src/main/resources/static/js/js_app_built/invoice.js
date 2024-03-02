$('document').ready(function (){

    $('table #editBtn').on('click',function (event){
         event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (item,status){
            $('#edit_id').val(item.id);
            var invoiceDate = item.invoiceDate.substr(0,10);
            $('#edit_invoiceDate').val(invoiceDate);
            $('#edit_remarks').val(item.remarks);
            $('#edit_client').val(item.clientId);
            $('#edit_invoiceStatus').val(item.invoiceStatusId);

        })

          $('#editModal').modal();
    })
    $('table #detailsBtn').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(item, status){
            $('#idDetails').val(item.id);
            var invoiceDate = item.invoiceDate.substr(0,10);
            $('#invoiceDateDetails').val(invoiceDate);
            $('#remarksDetails').val(item.remarks);
            $('#clientDetails').val(item.clientId);
            $('#invoiceStatusDetails').val(item.invoiceStatusId)
            $('#lastModifiedByDetails').val(item.lastModifiedBy);
            $('#lastModifiedDateDetails').val(item.lastModifiedDate.substr(0,19).replace("T", " "));
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