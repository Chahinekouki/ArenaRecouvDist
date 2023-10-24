const updateButtons = document.querySelectorAll('.update-button');
const deleteButtons = document.querySelectorAll('.delete-button');
const messageDiv = document.querySelector('#message');

updateButtons.forEach(button => {
    button.addEventListener('click', () => {
        const elementId = button.getAttribute('data-id');
        const newName = prompt('Enter a new name:');
        const newQuote = prompt('Enter a new quote:');
       

        fetch(`/quotes/${elementId}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                name: newName,
                quote: newQuote,
            }),
        })
        .then(res => {
            if (res.ok) {
                return res.json();
            }
        })
        .then(response => {
            console.log(response);
            window.location.reload();
        });
    });
});


deleteButtons.forEach(button => {
    button.addEventListener('click', () => {
        const elementId = button.getAttribute('data-id');

        fetch(`/quotes/${elementId}`, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json',
            },
        })
        .then(res => {
            if (res.ok) {
                return res.json();
            }
        })
        .then(response => {
            if (response === 'No quote to delete') {
                messageDiv.textContent = 'No more quotes to delete';
            } else {
                window.location.reload();
            }
        });
    });
});
