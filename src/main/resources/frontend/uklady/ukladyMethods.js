$(function(){
    $('.add').click(function(){
        $.ajax({
            contentType: 'application/json',
            url: "http://localhost:8080/uklad",
            type: "Post",
            data: JSON.stringify({
                "nazwa": document.getElementById("nazwa").value,
                "ilosc_planet": document.getElementById("ilosc_planet").value
            }),
            success: function(){
                alert("Dodano układ");
            },
            error: function () {
                alert("Błąd");
            }
        }).then(function (data) {
        });
    });
    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/uklad/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function () {
                if (!alert("Usunieto układ")) {
                    window.location.reload();
                }
            },
            error: function(){
                alert("Błąd");
            }
        }).then(function (data) {
        });
    });
});