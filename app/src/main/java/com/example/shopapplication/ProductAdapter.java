package com.example.shopapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductsViewHolder> {

    private Context context;
    private List<Product> productList;

    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public ProductsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_product, parent, false);
        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductsViewHolder holder, int position) {
        Product product = productList.get(position);

        String amount = String.valueOf(product.getPrice() * product.getQuantity());

        holder.textProduct.setText(product.getProduct());
        holder.textAmount.setText("₹" + amount);
        holder.textDateTime.setText(product.getDateTime());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductsViewHolder extends RecyclerView.ViewHolder {

        TextView textProduct, textAmount, textDateTime;

        public ProductsViewHolder(View itemView) {
            super(itemView);

            textProduct = itemView.findViewById(R.id.text_product);
            textAmount = itemView.findViewById(R.id.text_amount);
            textDateTime = itemView.findViewById(R.id.text_date);

        }

    }


}
