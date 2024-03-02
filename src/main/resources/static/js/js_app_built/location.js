$('document').ready(function (){

    $('table #editBtn').on('click',function (event){
         event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (item,status){
            $('#edit_id').val(item.id);
            $('#edit_address').val(item.address);
            $('#edit_city').val(item.city);
            $('#edit_description').val(item.description);
            $('#edit_details').val(item.details);
            $('#edit_country').val(item.countryid);
            $('#edit_state').val(item.stateid);

        })

          $('#editModal').modal();
    })
    $('table #detailsBtn').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(item, status){
            $('#idDetails').val(item.id);
            $('#descriptionDetails').val(item.description);
            $('#detailsDetails').val(item.details);
            $('#cityDetails').val(item.city);
            $('#addressDetails').val(item.address);
            $('#ddlStateDetails').val(item.stateid);
            $('#ddlCountryDetails').val(item.countryid);
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