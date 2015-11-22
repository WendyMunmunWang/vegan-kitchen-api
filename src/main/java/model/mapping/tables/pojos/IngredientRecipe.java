/**
 * This class is generated by jOOQ
 */
package model.mapping.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IngredientRecipe implements Serializable {

	private static final long serialVersionUID = -1499922798;

	private String  name;
	private Integer recipeId;
	private String  imageUrl;
	private Integer ingredientId;

	public IngredientRecipe() {}

	public IngredientRecipe(IngredientRecipe value) {
		this.name = value.name;
		this.recipeId = value.recipeId;
		this.imageUrl = value.imageUrl;
		this.ingredientId = value.ingredientId;
	}

	public IngredientRecipe(
		String  name,
		Integer recipeId,
		String  imageUrl,
		Integer ingredientId
	) {
		this.name = name;
		this.recipeId = recipeId;
		this.imageUrl = imageUrl;
		this.ingredientId = ingredientId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getIngredientId() {
		return this.ingredientId;
	}

	public void setIngredientId(Integer ingredientId) {
		this.ingredientId = ingredientId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("IngredientRecipe (");

		sb.append(name);
		sb.append(", ").append(recipeId);
		sb.append(", ").append(imageUrl);
		sb.append(", ").append(ingredientId);

		sb.append(")");
		return sb.toString();
	}
}