



    @Override
    public <MainActivity> void afterTextChanged() {
        afterTextChanged(null);
    }

    @Override
    public <MainActivity> void afterTextChanged(MainActivity s) {

        int id = 0;

        id = (int) itemtotal.getTag();
        String itemTot = itemtotal.getText().toString();


        if (id >= 0 && id <= totals.size()) {
            totals.set(id - 1, itemTot);

            double[] doubleList = new double[totals.size()];
            double newsum = 0.0d;
            for (int i = 0; i < totals.size(); ++i) {
                doubleList[i] = Double.parseDouble(totals.get(i));
                newsum += (double) Math.round((doubleList[i]) * 100.0) / 100.0;
            }
            textViewSum.setText(((double) Math.round((newsum * (0.02) + newsum) * 100.0) / 100.0) + "");//set total text to sum
            textViewVat.setText(((double) Math.round((newsum * (0.02)) * 100.0) / 100.0) + "");
        }
    }
