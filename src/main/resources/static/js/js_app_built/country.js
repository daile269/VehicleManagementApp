$('document').ready(function (){

    $('table #editBtn').on('click',function (event){
         event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (item,status){
            $('#edit_id').val(item.id);
            $('#edit_capital').val(item.capital);
            $('#edit_code').val(item.code);
            $('#edit_continent').val(item.continent);
            $('#edit_description').val(item.description);
            $('#edit_nationality').val(item.nationality);

        })

          $('#editModal').modal();
    })
    $('table #detailsBtn').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(item, status){
            $('#idDetails').val(item.id);
            $('#descriptionDetails').val(item.description);
            $('#codeDetails').val(item.code);
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