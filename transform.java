
    Set set = new HashSet<>();
    TransformProcessRecordReader temp = transformProcessRecordReader.;
     for(int i=1;i<=4991;i++){
            System.out.println("args = [" + transformProcessRecordReader.hasNext() + 
             "]");
            while(temp.hasNext()){
                set.add(temp.next().get(i).toDouble());
            }
         //check if set has size==1, if yes note down the index
           set.clear();
      }

