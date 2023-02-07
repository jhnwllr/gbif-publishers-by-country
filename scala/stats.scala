val sqlContext = new org.apache.spark.sql.SQLContext(sc)
import sqlContext.implicits._
import org.apache.spark.sql.SaveMode




// val snapshots = sqlContext.sql("show tables from snapshot").
// filter($"tableName".contains("occurrence")).
// filter($"tableName" =!= "export_occurrence_20170724").
// filter($"tableName" =!= "occurrence_20190101").
// filter(
// $"tableName".contains("2015") or
// $"tableName".contains("2016") or
// $"tableName".contains("2017") or
// $"tableName".contains("2018") or
// $"tableName".contains("2019") or
// $"tableName".contains("2020") or
// $"tableName".contains("2021") or
// $"tableName".contains("2022") 
// ).
// select("tableName").collect.map(row=>row.getString(0))

// val df_published = snapshots.
// map(snapshot => {
// val df = sqlContext.sql("SELECT * FROM snapshot." + snapshot).
// filter($"publisher_country" === "UA"). 
// groupBy("publisher_id").
// agg(
// count(lit(1)).alias("n_occ"),
// countDistinct("dataset_id").as("n_dataset"),
// countDistinct("species_id").as("n_species")
// ).
// withColumn("snapshot",lit(snapshot))

// df.show(100,false)
// df.write.mode("append").parquet("ua_stats.parquet")
// })

// add present day situation 

// val df_present = sqlContext.sql("SELECT * FROM prod_h.occurrence").
// filter($"publishingcountry" === "UA"). 
// groupBy("publishingorgkey").
// agg(
// count(lit(1)).alias("n_occ"),
// countDistinct("datasetkey").as("n_dataset"),
// countDistinct("specieskey").as("n_species")
// ).
// withColumn("snapshot",lit("occurrence_20220909")).
// withColumnRenamed("publishingorgkey","publisher_id")

// df_present.show(100,false)

// df_present.write.mode("append").parquet("ua_stats.parquet")

// val df_2017 = sqlContext.sql("SELECT * FROM snapshot.occurrence_20170412").
// withColumn("group",
// when($"kingdom" === "Fungi","Fungi").
// when($"kingdom" === "Bacteria","Bacteria").
// when($"kingdom" === "Archaea","Archaea").
// when($"class_rank" === "Insecta","Insecta").
// otherwise(null)
// ).
// filter($"group".isNotNull).
// groupBy("group","scientific_name","taxon_id").
// count().
// withColumn("year",lit("2017")).
// withColumnRenamed("scientific_name", "scientificname").
// withColumnRenamed("taxon_id", "taxonkey")

// df_2017.count()
// df_2017.show(100,false)
// df_2017.printSchema()
// df_2017.write.mode("append").parquet("stats.parquet")

// val df_2022 = sqlContext.sql("SELECT * FROM prod_h.occurrence").
// withColumn("group",
// when($"kingdom" === "Fungi","Fungi").
// when($"kingdom" === "Bacteria","Bacteria").
// when($"kingdom" === "Archaea","Archaea").
// when($"class" === "Insecta","Insecta").
// otherwise(null)
// ).
// filter($"group".isNotNull).
// groupBy("group","scientificname","taxonkey").
// count().
// withColumn("year",lit("2022"))

// df_2022.count()
// df_2022.show(100,false)
// df_2022.printSchema()
// df_2022.write.mode("append").parquet("stats.parquet")

System.exit(0)




