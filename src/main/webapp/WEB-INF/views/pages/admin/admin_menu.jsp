
         <div class="menu-main">
              <div class="menu-header">
                          <div class="menu-categories">
                            <button class="main-btn">All Items</button>
                            <button class="main-btn">Beverages</button>
                            <button class="main-btn">Food</button>
                            <button class="main-btn">Desserts</button>
                          </div>
                      <button class="add-item-btn" onclick="openPopup()">
                        <i class="fa-solid fa-plus"></i> Add New Item
                      </button>
              </div>
               <div class="menu-body"></div>
         </div>
              <!-- Add Item Popup -->
       <div id="addItemPopup" class="popup">
           <div class="popup-content">
                      <div class="popup-cancel-btn">
                        <span
                          ><i class="fa-solid fa-xmark" onclick="closePopup()"></i
                        ></span>
                      </div>
                  <h2>Add New Item</h2>
                  <form method="post" class="form" action="/admin/menu" enctype="multipart/form-data">
                        <div class="item-div">
                         <!-- <label for="itemName">Item Name</label> -->
                          <input type="text" id="itemName" name="itemName" placeholder="Item Name" required />
                        </d    iv>
                        <div class="item-div">
                           <!-- <label for="itemPrice">Price</label> -->
                          <input
                            type="number"
                            id="itemPrice"
                            name="itemPrice"
                            step="0.001"
                            placeholder="Item Price"
                            required
                          />
                        </div>

                        <div class="item-div">
                           <!-- <label for="itemCategory">Category</label> -->
                          <select
                            id="itemCategory"
                            name=" categoryId"
                            class="itemDropDown"
                            required>
                          </select>
                        </div>

                        <div class="item-div">
                          <!-- <label for="itemDescription">Description</label> -->
                          <textarea
                            id="itemDescription"
                            name="itemDescription"
                            rows="4"
                            placeholder="Enter menu description..."
                          ></textarea>
                        </div>

                        <div class="item-checkbox">
                          <input
                            type="checkbox"
                            id="fileCheckbox"
                            name="isAttachFile"
                            value=true
                            onclick="showFileUpload();"
                          />
                          <span for="fileCheckbox">Do attach image file?</span>
                        </div>

                        <div class="item-file" id="item-file">
                          <div class="image-container">
                            <img id="previewImage" class="previewImage" />
                            <label for="itemFile" class="change-btn">
                              <i class="fa-solid fa-upload"></i>
                            </label>
                          </div>
                          <input
                            type="file"
                            name="file"
                            id="itemFile"
                            class="fileInput"
                            onchange="showImagePreview('itemFile','previewImage')"
                          />
                        </div>

                        <div class="item-div">
                          <input type="submit" value="Save" class="save-btn" />
                        </div>
                    </form>
           </div>
    </div>




