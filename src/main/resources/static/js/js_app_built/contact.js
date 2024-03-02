$('document').ready(function (){

    $('table #editBtn').on('click',function (event){
         event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (item,status){
            $('#edit_id').val(item.id);
            $('#edit_email').val(item.email);
            $('#edit_firstname').val(item.firstname);
            $('#edit_lastname').val(item.lastname);
            $('#edit_phone').val(item.phone);
            $('#edit_remarks').val(item.remarks);

        })

          $('#editModal').modal();
    })
    $('table #detailsBtn').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(item, status){
            $('#idDetails').val(item.id);
            $('#emailDetails').val(item.email);
            $('#firstnameDetails').val(item.firstname);
            $('#lastnameDetails').val(item.lastname);
            $('#phoneDetails').val(item.phone);
            $('#remarksDetails').val(item.remarks);
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