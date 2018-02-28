$(function(){
    $('.add').click(function(){
        $.ajax({
            contentType: 'application/json',
            url: "http://localhost:8080/planeta",
            type: "Post",
            data: JSON.stringify({
                "nazwa": document.getElementById("nazwa").value,
                "masa": document.getElementById("masa").value,
                "okres orbitalny": document.getElementById("okres_orbitalny").value,
                "uklad": document.getElementById("uklad").value
            }),
            success: function(){
                alert("Dodano planete");
            },
            error: function () {
                alert("Błąd");
            }
        }).then(function (data) {
        });
    });
    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/planeta/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function () {
                if (!alert("Usunieto planete")) {
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