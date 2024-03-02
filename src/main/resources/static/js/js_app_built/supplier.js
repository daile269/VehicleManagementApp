$('document').ready(function (){

    $('table #editBtn').on('click',function (event){
         event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (item,status){
            $('#edit_id').val(item.id);
            $('#edit_address').val(item.address);
            $('#edit_city').val(item.city);
            $('#edit_details').val(item.details);
            $('#edit_email').val(item.email);
            $('#edit_name').val(item.name);
            $('#edit_phone').val(item.phone);
            $('#edit_website').val(item.website);
            $('#edit_country').val(item.countryId);
            $('#edit_state').val(item.stateId);

        })

          $('#editModal').modal();
    })
    $('table #detailsBtn').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(item, status){
            $('#idDetails').val(item.id);
            $('#detailsDetails').val(item.details);
            $('#cityDetails').val(item.city);
            $('#addressDetails').val(item.address);
            $('#ddlStateDetails').val(item.stateId);
            $('#ddlCountryDetails').val(item.countryId);
            $('#emailDetails').val(item.email);
            $('#nameDetails').val(item.name);
            $('#phoneDetails').val(item.phone);
            $('#websiteDetails').val(item.website);
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