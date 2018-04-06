package Archives;


import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.blackcoin.packdel.bahmanproject.MainActivity;
import com.blackcoin.packdel.bahmanproject.R;

import java.util.List;

import Dialogs.ChestDialog;
import Models.Chest;
import Models.Book;


public class ChestRecycleViewAdapter extends RecyclerView.Adapter<ChestRecycleViewAdapter.MyViewHolder> {

    private Context context;
    private List<Chest> chestList;
    private Resources resources;

    public ChestRecycleViewAdapter(Context context, List<Chest> chestList, Resources resources){
        this.context = context;
        this.chestList = chestList;
        this.resources = resources;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_archives_chest_item, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.fieldNameParent.setCardBackgroundColor(resources.getColor(Book.setFieldColor(chestList.get(position).getField())));
        holder.fieldName.setText(resources.getString(Book.setFieldString(chestList.get(position).getField())));
        holder.chestImg.setImageResource(R.drawable.ic_chest);
        holder.chestImg.setColorFilter(resources.getColor(Book.setFieldColor(chestList.get(position).getField())));
        holder.loadNum.setText(String.valueOf(chestList.get(position).getLoad()));
        holder.capacity.setText(String.valueOf(chestList.get(position).getCapacity()));

        /*
        * after clicking a chest card we should bring a dialog to show the tests inside
        */
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new ChestDialog(context).setup();
            }
        });
    }

    @Override
    public int getItemCount() {
        return chestList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        CardView fieldNameParent;
        TextView fieldName;
        ImageView chestImg;
        TextView loadNum;
        TextView capacity;
        View view;

        private MyViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            fieldNameParent = itemView.findViewById(R.id.card_field_name_parent);
            fieldName = itemView.findViewById(R.id.card_field_name);
            fieldName.setTypeface(MainActivity.myFont);
            chestImg = itemView.findViewById(R.id.card_chest_img);
            loadNum = itemView.findViewById(R.id.card_test_number);
            loadNum.setTypeface(MainActivity.myFont);
            capacity = itemView.findViewById(R.id.card_capacity);
            capacity.setTypeface(MainActivity.myFont);
        }
    }
}
