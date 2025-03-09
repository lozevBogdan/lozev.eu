// Add a slow loading effect on page load
document.addEventListener("DOMContentLoaded", function () {
    document.body.classList.add("loaded");
});

function sendEmail(event) {
    event.preventDefault();

    const from = document.getElementById('from').value;
    const about = document.getElementById('about').value;
    const message = document.getElementById('text-message').value;

    const subject = encodeURIComponent(about);
    const body = encodeURIComponent(`From: ${from}\n\nMessage:\n${message}`);

    const mailtoLink = `mailto:lozev.bogdan@gmail.com?subject=${subject}&body=${body}`;

    window.location.href = mailtoLink;
    }

