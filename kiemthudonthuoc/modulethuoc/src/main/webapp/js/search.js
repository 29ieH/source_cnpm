<!-- Thêm thư viện jQuery -->
    $(document).ready(function () {
        $('#txtSearch').on('input', function () {
            var query = $(this).val();

            // Gửi yêu cầu AJAX để lấy dữ liệu từ máy chủ
            $.ajax({
                url: '/searchthuoc', // Đường dẫn đến Servlet xử lý tìm kiếm
                method: 'GET',
                data: { txtSearch: query },
                success: function (data) {
                    // Xử lý dữ liệu JSON nhận được
                    displaySearchResults(data);
                },
                error: function (error) {
                    console.log(error);
                }
            });
        });
    });

    function displaySearchResults(data) {
        var searchResultsDiv = $('#searchResults');

        // Xóa nội dung cũ
        searchResultsDiv.empty();

        // Kiểm tra xem có dữ liệu không
        if (data.length > 0) {
            // Duyệt qua danh sách và hiển thị kết quả
            data.forEach(function (thuoc) {
                // Tạo một phần tử <div> mới cho mỗi kết quả
                var resultItem = $('<div class="result-item"></div>');

                // Hiển thị tên thuốc trong phần tử <div>
                resultItem.text(thuoc.tenThuoc);

                // Bắt sự kiện khi người dùng chọn một kết quả
                resultItem.on('click', function () {
                    // Đặt giá trị chọn vào ô tìm kiếm
                    $('#txtSearch').val(thuoc.tenThuoc);

                    // Xóa kết quả gợi ý
                    searchResultsDiv.empty();
                });

                // Thêm phần tử vào danh sách kết quả
                searchResultsDiv.append(resultItem);
            });
        } else {
            // Nếu không có kết quả, hiển thị thông báo
            searchResultsDiv.text('Không có kết quả.');
        }
    }