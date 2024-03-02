$('document').ready(function() {

    $('table #editBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function (employee, status) {
            $('#txtAddressEdit').val(employee.address);
            $('#txtUsernameEdit').val(employee.username);
            $('#txtCityEdit').val(employee.city);
            $('#ddlNationalityEdit').val(employee.countryId);
            var dob = employee.dateOfBirth.substr(0, 10);
            $('#txtDateOfBirthEdit').val(dob);
            $('#txtEmailEdit').val(employee.email);
            $('#txtFirstnameEdit').val(employee.firstname);
            $('#ddlGenderEdit').val(employee.gender);
            $('#txtIdEdit').val(employee.id);
            $('#txtInitialsEdit').val(employee.initials);
            $('#txtLastnameEdit').val(employee.lastname);
            $('#ddlMaritalStatusEdit').val(employee.maritalStatus);
            $('#txtPhoneEdit').val(employee.phone);
            $('#txtSSNEdit').val(employee.socialSecurityNumber);
            $('#ddlStateEdit').val(employee.stateId);
            $('#ddlTitleEdit').val(employee.title);
            $('#ddlEmployeeTypeEdit').val(employee.employeeTypeId);
            var hireDate = employee.hireDate.substr(0, 10);
            $('#txtHireDateEdit').val(hireDate);
            $('#ddlJobTitleEdit').val(employee.jobTitleId);
        });
        $('#editModal').modal();
    });

    $('table #detailsBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function (employee, status) {
            $('#idDetails').val(employee.id);
            $('#addressDetails').val(employee.address);
            $('#usernameDetails').val(employee.username);
            $('#cityDetails').val(employee.city);
            $('#countryDetails').val(employee.countryId);
            var dob = employee.dateOfBirth.substr(0, 10);
            $('#dateOfBirthDetails').val(dob);
            $('#emailDetails').val(employee.email);
            $('#firstnameDetails').val(employee.firstname);
            $('#genderDetails').val(employee.gender);
            $('#initialsDetails').val(employee.initials);
            $('#lastnameDetails').val(employee.lastname);
            $('#maritalStatusDetails').val(employee.maritalStatus);
            $('#phoneDetails').val(employee.phone);
            $('#socialSecurityNumberDetails').val(employee.socialSecurityNumber);
            $('#stateDetails').val(employee.stateId);
            $('#titleDetails').val(employee.title);
            $('#employeeTypeDetails').val(employee.employeeTypeId);
            var hireDate = employee.hireDate.substr(0, 10);
            $('#hireDateDetails').val(hireDate);
            $('#jobTitleDetails').val(employee.jobTitleId);
        });
            $('#detailsModal').modal();
        });

        $('table #deleteBtn').on('click', function (event) {
            event.preventDefault();
            var href = $(this).attr('href');
            $('#deleteModal #delRef').attr('href', href);
            $('#deleteModal').modal();
        });

           $('.table #photoButton').on('click',function(event) {
               event.preventDefault();
               var href = $(this).attr('href');
               $('#photoModal #employeePhoto').attr('src', href);
               $('#photoModal').modal();
           });

  /*        $('#uploadButton').on('click',function(event){
              var href = $(this).attr('href');
              $.post(href, function(data, status){
                  console.log(data);
              });
          });*/

    });
