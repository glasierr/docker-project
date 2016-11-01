function send() {

    const licenceId = $("#licence-id").val();
    const name = $("#name").val();
    const surname = $("#surname").val();
    const email = $("#email").val();

    if (!licenceId) {
        alert("Licence id is required!");
    }

    $.ajax({
        headers: {
            'Content-Type': 'application/json'
        },
        type: "POST",
        url: "http://localhost:8080/drivers",
        data: JSON.stringify({
            licenceId: licenceId,
            name: name,
            surname: surname,
            email: email
        }),
        dataType: "json"
    });
}
