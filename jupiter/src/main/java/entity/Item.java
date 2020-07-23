package entity;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Item {
	private String itemId;
	private String name;
	private String address;
	private Set<String> keywords;
	private String imageUrl;
	private String url;
	
	public JSONObject toJSONObject() {
		JSONObject obj = new JSONObject();
		obj.put("item_id", itemId);
		obj.put("name", name);
		obj.put("address", address);
		obj.put("keywords", new JSONArray(keywords));
		obj.put("image_url", imageUrl);
		obj.put("url", url);
		return obj;
	}

}

// item class no longer needs setters for private field - read-only
// static - able to create ItemBuilder before Item
// ItemBuilder builder = new ItemBuilder();
// builder.setName(...)
// Item item = builder.build()
