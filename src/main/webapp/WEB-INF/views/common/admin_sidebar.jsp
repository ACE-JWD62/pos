<div class="side-bar">
            <div class="side-bar-header">
                <div class="side-bar-header-details">
                    <h3>Burmes POS</h3>
                    <p class="user-role">admin</p>
                </div>
                <i class="fa-solid fa-bars"></i>
            </div>
            <div class="side-bar-items">
                <ul>
                    <li class="${currentPage == 'dashboard' ? 'active' : '' }"><a href="/admin/dashboard"><i class="fa-solid fa-chart-simple"></i>Dashboard</a></li>
                    <li class="${currentPage == 'menus' ? 'active' : '' }"><a href="/admin/menus"><i class="fa-solid fa-bowl-food"></i>Menus</a></li>
                    <li class="${currentPage == 'inventory' ? 'active' : '' }"><a href="/admin/inventory"><i class="fa-solid fa-cubes"></i>Inventory</a></li>
                    <li class="${currentPage == 'users' ? 'active' : '' }"><a href="/admin/users"><i class="fa-solid fa-user"></i>Users</a></li>
                    <li class="${currentPage == 'reports' ? 'active' : '' }"><a href="/admin/reports"><i class="fa-solid fa-gears"></i>Reports</a></li>
                </ul>
            </div>
        </div>