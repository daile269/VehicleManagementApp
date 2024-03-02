$('document').ready(function() {
    $('table #editBtn').on('click',function(event){
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(vehicle, status){
            var acDate = vehicle.acquisitionDate.substr(0,10);
            $('#txtAcquisitionDateEdit').val(acDate);
            $('#txtDescriptionEdit').val(vehicle.description);
            $('#ddlEmployeeEdit').val(vehicle.employeeId);
            $('#txtFuelCapacityEdit').val(vehicle.fuelCapacity);
            $('#txtIdEdit').val(vehicle.id);
            $('#ddlLocationEdit').val(vehicle.locationId);
            $('#txtNameEdit').val(vehicle.name);
            $('#txtNetWeightEdit').val(vehicle.netWeight);
            $('#txtPowerEdit').val(vehicle.power);
            var regDate = vehicle.registrationDate.substr(0,10);
            $('#txtRegistrationDateEdit').val(regDate);
            $('#txtRemarksEdit').val(vehicle.remarks);
            $('#ddlVehicleMakeEdit').val(vehicle.vehicleMakeId);
            $('#ddlVehicleModelEdit').val(vehicle.vehicleModelId);
            $('#txtVehicleNumberEdit').val(vehicle.vehicleNumber);
            $('#ddlVehicleStatusEdit').val(vehicle.vehicleStatusId);
            $('#ddlVehicleTypeEdit').val(vehicle.vehicleTypeId);
        });
        $('#editModal').modal();
    });

    $('table #detailsBtn').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(vehicle, status){
            $('#idDetails').val(vehicle.id);
            var acDate = vehicle.acquisitionDate.substr(0,10);
            $('#acquisitionDateDetails').val(acDate);
            $('#descriptionDetails').val(vehicle.description);
            $('#employeeDetails').val(vehicle.employeeId);
            $('#fuelCapacityDetails').val(vehicle.fuelCapacity);
            $('#locationDetails').val(vehicle.locationId);
            $('#nameDetails').val(vehicle.name);
            $('#netWeightDetails').val(vehicle.netWeight);
            $('#powerDetails').val(vehicle.power);
            var regDate = vehicle.registrationDate.substr(0,10);
            $('#registrationDateDetails').val(regDate);
            $('#remarksDetails').val(vehicle.remarks);
            $('#vehicleMakeDetails').val(vehicle.vehicleMakeId);
            $('#vehicleModelDetails').val(vehicle.vehicleModelId);
            $('#vehicleNumberDetails').val(vehicle.vehicleNumber);
            $('#vehicleStatusDetails').val(vehicle.vehicleStatusId);
            $('#vehicleTypeDetails').val(vehicle.vehicleTypeId);
        });
        $('#detailsModal').modal();
    });

    $('table #deleteBtn').on('click',function(event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#deleteModal #delRef').attr('href', href);
        $('#deleteModal').modal();
    });


});