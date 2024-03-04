$('document').ready(function (){

    $('table #editBtn').on('click',function (event){
         event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (item,status){
            $('#edit_id').val(item.id);
            $('#edit_firstname').val(item.firstname);
            $('#edit_lastname').val(item.lastname);
            $('#edit_username').val(item.username);
            $('#edit_password').val(item.password);

        })

          $('#editModal').modal();
    })
    $('table #detailsBtn').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(item, status){
            $('#idDetails').val(item.id);
            $('#firstnameDetails').val(item.firstname);
            $('#lastnameDetails').val(item.lastname);
            $('#usernameDetails').val(item.username);
            $('#passwordDetails').val(item.password);
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