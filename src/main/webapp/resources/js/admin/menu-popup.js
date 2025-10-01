

function openPopup(){
console.log('open popup and call backend api');
    fetch('/admin/category')
            .then(response => response.json())
            .then(data => {
            console.log(data);
                let dropdown = document.getElementById("itemCategory");
                dropdown.innerHTML = '<option value="">Select Category</option>'; // reset

                data.forEach(cat => {
                    let option = document.createElement("option");
                    option.value = cat.id;   // id from DB
                    option.textContent = cat.categoryName; // category name
                    dropdown.appendChild(option);
                });
            })
            .catch(err => console.error("Error loading categories:", err));
            const model = document.getElementById("addItemPopup");
            model.style.display="block";
}

function closePopup(){
    const popup = document.getElementById("addItemPopup");
    const form = popup.querySelector("form");
    form.reset();
    popup.style.display="none";
    showFileUpload();
}

function showFileUpload(){
    const checkbox = document.getElementById("fileCheckbox");
    const fileDiv = document.getElementById("item-file");
    const preview = document.getElementById("previewImage");
    if(checkbox.checked){
        fileDiv.style.display="flex";
        preview.src='https://placehold.co/300x300';
    }else{
        fileDiv.style.display="none";
    }
}

function showImagePreview(inputId, previewId){
    const input = document.getElementById(inputId);
    const preview = document.getElementById(previewId);
    // const label = document.getElementById(labelId);


    const file = input.files[0];
    console.log(preview);

    // console.log(file);

    if(file){
        const reader = new FileReader();
        reader.onload = function(e){
            preview.src = e.target.result;
            preview.style.display="block";

        }
        reader.readAsDataURL(file);
    }else{

        preview.src = "";
        preview.style.display="none";
        input.style.display="block";
        label.style.display="block";


    }
}

// file: resources/js/admin/menu-popup.js
document.addEventListener('DOMContentLoaded', function () {
  const popup = document.getElementById('statusMsgPopup');
  if (!popup) return;
  const textEl = popup.querySelector('.statusMsgPopup-content h2');
  if (textEl && textEl.textContent.trim().length > 0) {
    popup.style.display = 'block';
    setTimeout(() => popup.style.display = 'none', 5000);
  }
});
