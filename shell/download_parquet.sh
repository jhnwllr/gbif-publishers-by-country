FILE_NAME=$1
rm -r data/$FILE_NAME.parquet
wget -O data/$FILE_NAME.parquet.zip http://download.gbif.org/custom_download/jwaller/$FILE_NAME.parquet.zip
rm -r data/$FILE_NAME.parquet
unzip data/$FILE_NAME.parquet.zip -d data/$FILE_NAME.parquet
rm -r data/$FILE_NAME.parquet.zip
