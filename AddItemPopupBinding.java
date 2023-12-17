// Generated by view binder compiler. Do not edit!
package com.example.option1_inventoryapp_rayyanabdulmunib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.option1_inventoryapp_rayyanabdulmunib.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddItemPopupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button actionAdd;

  @NonNull
  public final TextView addItemTitle;

  @NonNull
  public final EditText itemDescription;

  @NonNull
  public final EditText itemImage;

  @NonNull
  public final EditText itemName;

  @NonNull
  public final EditText itemQuantity;

  private AddItemPopupBinding(@NonNull LinearLayout rootView, @NonNull Button actionAdd,
      @NonNull TextView addItemTitle, @NonNull EditText itemDescription,
      @NonNull EditText itemImage, @NonNull EditText itemName, @NonNull EditText itemQuantity) {
    this.rootView = rootView;
    this.actionAdd = actionAdd;
    this.addItemTitle = addItemTitle;
    this.itemDescription = itemDescription;
    this.itemImage = itemImage;
    this.itemName = itemName;
    this.itemQuantity = itemQuantity;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddItemPopupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddItemPopupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_item_popup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddItemPopupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.action_add;
      Button actionAdd = ViewBindings.findChildViewById(rootView, id);
      if (actionAdd == null) {
        break missingId;
      }

      id = R.id.addItemTitle;
      TextView addItemTitle = ViewBindings.findChildViewById(rootView, id);
      if (addItemTitle == null) {
        break missingId;
      }

      id = R.id.item_description;
      EditText itemDescription = ViewBindings.findChildViewById(rootView, id);
      if (itemDescription == null) {
        break missingId;
      }

      id = R.id.item_image;
      EditText itemImage = ViewBindings.findChildViewById(rootView, id);
      if (itemImage == null) {
        break missingId;
      }

      id = R.id.item_name;
      EditText itemName = ViewBindings.findChildViewById(rootView, id);
      if (itemName == null) {
        break missingId;
      }

      id = R.id.item_quantity;
      EditText itemQuantity = ViewBindings.findChildViewById(rootView, id);
      if (itemQuantity == null) {
        break missingId;
      }

      return new AddItemPopupBinding((LinearLayout) rootView, actionAdd, addItemTitle,
          itemDescription, itemImage, itemName, itemQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}