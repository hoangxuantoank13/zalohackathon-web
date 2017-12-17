$(document).ready(function () {
   
    $('#table-mp3-seen').DataTable({
        columnDefs: [
            {"className": "dt-center", "targets": "_all"}
        ]

    });
    $('#table-mp3-recommend').DataTable({
        columnDefs: [
            {"className": "dt-center", "targets": "_all"}

        ]

    });

});

function submitForm() {
    var userId = $("#user_id").val();
    window.location = "/find?userId=" + userId;
    
}


function randomUserId() {
    $.ajax({
        type: "POST",
        url: '/find',
        data: {},
        success: function (data) {

            if (data !== null) {
                $("#user_id").val(data);
            }
        }
    });
    
}
