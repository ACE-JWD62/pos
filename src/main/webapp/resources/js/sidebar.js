document.addEventListener('DOMContentLoaded', () => {
    const items = document.querySelectorAll('.side-bar-items ul li');
    console.log('Sidebar JS loaded');

    items.forEach(item => {
        item.addEventListener('click', () => {
            items.forEach(i => i.classList.remove('active'));
            item.classList.add('active');
        });
    });
});