package com.example.bt_buoi6;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import java.io.IOException;
import java.io.InputStream;

public class PhotoData {
    /*public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, "https://cdn.tgdd.vn/2022/05/CookDish/cherry-la-qua-gi-co-may-loai-phan-biet-cherry-my-voi-cherry-avt-1200x676.jpg", "Cherry","Anh đào thương mại được lấy từ các giống cây trồng của một số loài, chẳng hạn như Prunus avium ngọt và Prunus cerasus chua. Tên gọi 'anh đào' cũng đề cập đến cây và gỗ của nó, và đôi khi được áp dụng cho hạnh nhân và cây có hoa tương tự trong chi Prunus, như trong \"anh đào cảnh\" hoặc \"hoa anh đào\". Anh đào dại có thể đề cập đến bất kỳ loài anh đào nào nằm ngoài phạm vi đất canh tác, mặc dù Prunus avium thường được gọi cụ thể bằng cái tên \"anh đào dại\" ở quần đảo Anh."));
        photos.add(new Photo(1, "https://hoaquafuji.com/storage/app/media/anh-sua/cropped-images/tao-do-2-6-16-794-709-1623469683.jpg", "Apple", "Quả táo có chứa rất nhiều dưỡng chất có lợi cho sức khỏe của bạn chẳng hạn như Carb, chất xơ, đường, chất béo, vitamin C, kali, magie,… Tuy cung cấp nhiều dinh dưỡng nhưng một quả táo chỉ có chứa 52 calo."));
        photos.add(new Photo(2, "https://www.baokontum.com.vn/uploads/Image/2021/07/24/155939vuon-sau-rien.jpg", "durian", "Quả sầu riêng được nhiều người ở Đông Nam Á xem như là \"vua của các loại trái cây\". Nó có đặc điểm là kích thước lớn, mùi mạnh, và nhiều gai nhọn bao quanh vỏ. Quả có thể đạt 30 xentimét (12 in) chiều dài và 15 xentimét (6 in) đường kính, thường nặng một đến ba kilogram (2 đến 7 lb). Tùy thuộc vào từng loài mà quả có hình dáng từ thuôn đến tròn, màu vỏ từ xanh lục đến nâu, màu thịt quả từ vàng nhạt đến đỏ."));
        photos.add(new Photo(3, "https://cdn.tgdd.vn/2021/05/CookProduct/0-1200x676-8.jpg", "strawberry", "Dâu tây vườn hay gọi đơn giản là dâu tây (danh pháp khoa học: Fragaria × ananassa)[1] là một chi thực vật hạt kín và loài thực vật có hoa thuộc họ Hoa hồng (Rosaceae). Dâu tây xuất xứ từ châu Mỹ và được các nhà làm vườn châu Âu cho lai tạo vào thế kỷ 18 để tạo nên giống dâu tây được trồng rộng rãi hiện nay. Loài này được (Weston) Duchesne miêu tả khoa học đầu tiên năm 1788."));
        photos.add(new Photo(4, "https://cafefcdn.com/thumb_w/650/203337114487263232/2021/7/31/photo1627699917850-16276999180562069545959.jpg", "coconut", "Dừa (Cocos nucifera) là một loài thực vật thân gỗ, thành viên thuộc họ Cau (Arecaceae) và là loài duy nhất còn sống thuộc chi Cocos.[1] Dừa có mặt khắp nơi tại các vùng nhiệt đới ven biển và là một biểu tượng văn hóa nhiệt đới. Dừa cung cấp thực phẩm, nhiên liệu, mỹ phẩm, thuốc dân gian và vật liệu xây dựng, cùng nhiều công dụng khác. Phần thịt bên trong của quả dừa chín, cũng như nước cốt dừa được vắt ra từ đây, là một phần quen thuộc trong khẩu phần của người dân sống tại vùng nhiệt đới và cận nhiệt đới."));
        photos.add(new Photo(5, "https://api.ajumagarden.com/Upload/WEBSITE_POSTS/Ajuma_dua-hau-co-hat1_1_20220817095327745.jpg", "watermelon","Dưa hấu (tên khoa học là Citrullus lanatus) là một loài thực vật thuộc họ Cucurbitaceae, một loài thực vật có hoa giống như cây nho có nguồn gốc từ khu Tây Phi. Nó được trồng để lấy quả. Dưa hấu (Citrullus lanatus) là một loài dây leo xoắn và dài trong họ thực vật có hoa Cucurbitaceae. Có bằng chứng từ hạt giống dưa hấu trong những ngôi mộ Pharaoh ở Ai Cập cổ đại. "));
        photos.add(new Photo(6, "https://www.foodnk.com/wp-content/uploads/2021/01/tim-hieu-ve-qua-mit-san-pham-va-cac-vi-luong-co-trong-qua-mit-01-min.jpg", "jackfruit", "Mít (danh pháp hai phần: Artocarpus heterophyllus) là loài thực vật ăn quả, mọc phổ biến ở vùng Đông Nam Á và Brasil. Mít thuộc họ Dâu tằm (Moraceae) và được cho là có nguồn gốc từ Ấn Độ. Quả mít là loại quả quốc gia của Bangladesh."));

        return photos;
    }
    public static Photo getPhotoById(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i <phs.size(); i++){
            if(phs.get(i).getId() == id){
                return phs.get(i);
            }
        }
        return null;
    }*/

    private static Context context;

    public static void init(Context context) {
        PhotoData.context = context;
    }

    public static ArrayList<Photo> getPhotos() {
        ArrayList<Photo> photos = new ArrayList<>();

        try {
            String jsonString = loadJSONFromAsset("dataPhoto.json");
            JSONArray jsonArray = new JSONArray(jsonString);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = jsonObject.getInt("id");
                String source = jsonObject.getString("source");
                String title = jsonObject.getString("title");
                String description = jsonObject.getString("description");
                photos.add(new Photo(id, source, title, description));
            }

        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }

        return photos;
    }

    private static String loadJSONFromAsset(String fileName) throws IOException {
        String jsonString;
        InputStream inputStream = context.getAssets().open(fileName);
        int size = inputStream.available();
        byte[] buffer = new byte[size];
        inputStream.read(buffer);
        inputStream.close();
        jsonString = new String(buffer, "UTF-8");
        return jsonString;
    }
    public static Photo getPhotoById(int id) {
        Photo photo = null;

        try {
            String jsonString = loadJSONFromAsset("dataPhoto.json");
            JSONArray jsonArray = new JSONArray(jsonString);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int photoId = jsonObject.getInt("id");

                if (photoId == id) {
                    String source = jsonObject.getString("source");
                    String title = jsonObject.getString("title");
                    String description = jsonObject.getString("description");
                    photo = new Photo(id, source, title, description);
                    break;
                }
            }

        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }

        return photo;
    }
}
