CREATE MEMORY TABLE "PUBLIC"."addresses"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "city" VARCHAR_IGNORECASE(255),
    "country" VARCHAR_IGNORECASE(255),
    "number" VARCHAR_IGNORECASE(255),
    "residential" BOOLEAN,
    "state" VARCHAR_IGNORECASE(255),
    "street" VARCHAR_IGNORECASE(255),
    "town" VARCHAR_IGNORECASE(255),
    "zipcode" VARCHAR_IGNORECASE(255)
);
ALTER TABLE "PUBLIC"."addresses" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_3" PRIMARY KEY("id");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.addresses;

CREATE MEMORY TABLE "PUBLIC"."authorizations"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "authorized" BOOLEAN,
    "error" VARCHAR_IGNORECASE(255),
    "message" VARCHAR_IGNORECASE(255),
    "order_id" VARCHAR_IGNORECASE(255),
    "supply_id" VARCHAR_IGNORECASE(255)
);      
ALTER TABLE "PUBLIC"."authorizations" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_F" PRIMARY KEY("id");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.authorizations;

CREATE MEMORY TABLE "PUBLIC"."cards"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "csc" VARCHAR_IGNORECASE(255),
    "expires" VARCHAR_IGNORECASE(255),
    "number" VARCHAR_IGNORECASE(255),
    "user_id" VARCHAR_IGNORECASE(255)
);               
ALTER TABLE "PUBLIC"."cards" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_5" PRIMARY KEY("id");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.cards;

CREATE MEMORY TABLE "PUBLIC"."cart_item"(
    "cart_id" VARCHAR_IGNORECASE(255) NOT NULL,
    "item_id" VARCHAR_IGNORECASE(255) NOT NULL
);    
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.cart_item;

CREATE MEMORY TABLE "PUBLIC"."carts"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "joined" BOOLEAN DEFAULT TRUE,
    "user_id" VARCHAR_IGNORECASE(255)
);            
ALTER TABLE "PUBLIC"."carts" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_5A" PRIMARY KEY("id");        
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.carts;

CREATE MEMORY TABLE "PUBLIC"."correlations"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "item_id" BINARY,
    "order_id" BINARY
);  
ALTER TABLE "PUBLIC"."correlations" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_51" PRIMARY KEY("id"); 
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.correlations;

CREATE MEMORY TABLE "PUBLIC"."customers"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "name" VARCHAR_IGNORECASE(255) NOT NULL,
    "phone" VARCHAR_IGNORECASE(255) NOT NULL,
    "surname" VARCHAR_IGNORECASE(255) NOT NULL
);       
ALTER TABLE "PUBLIC"."customers" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_6" PRIMARY KEY("id");     
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.customers;

CREATE MEMORY TABLE "PUBLIC"."forwarder_shipment"(
    "forwarder_id" VARCHAR_IGNORECASE(255) NOT NULL,
    "shipment_id" VARCHAR_IGNORECASE(255) NOT NULL
);  
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.forwarder_shipment;

CREATE MEMORY TABLE "PUBLIC"."forwarders"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "active" BOOLEAN DEFAULT FALSE,
    "email" VARCHAR_IGNORECASE(255) NOT NULL,
    "name" VARCHAR_IGNORECASE(255) NOT NULL,
    "phone" VARCHAR_IGNORECASE(255) NOT NULL
);    
ALTER TABLE "PUBLIC"."forwarders" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_2" PRIMARY KEY("id");    
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.forwarders;

CREATE MEMORY TABLE "PUBLIC"."items"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "available" BOOLEAN DEFAULT FALSE,
    "price" DECIMAL(19, 2),
    "quantity" INTEGER,
    "product_id" VARCHAR_IGNORECASE(255)
); 
ALTER TABLE "PUBLIC"."items" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_5F" PRIMARY KEY("id");        
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.items;

CREATE MEMORY TABLE "PUBLIC"."order_item"(
    "order_id" VARCHAR_IGNORECASE(255) NOT NULL,
    "item_id" VARCHAR_IGNORECASE(255) NOT NULL
);  
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.order_item;

CREATE MEMORY TABLE "PUBLIC"."orders"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "processed" BOOLEAN DEFAULT FALSE,
    "total" DECIMAL(19, 2),
    "address_id" VARCHAR_IGNORECASE(255),
    "card_id" VARCHAR_IGNORECASE(255),
    "customer_id" VARCHAR_IGNORECASE(255) NOT NULL,
    "payment_id" VARCHAR_IGNORECASE(255),
    "shipment_id" VARCHAR_IGNORECASE(255)
);        
ALTER TABLE "PUBLIC"."orders" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_C" PRIMARY KEY("id");        
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.orders;

CREATE MEMORY TABLE "PUBLIC"."payments"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "approved" BOOLEAN DEFAULT FALSE,
    "message" VARCHAR_IGNORECASE(255),
    "paid" BOOLEAN DEFAULT FALSE
);    
ALTER TABLE "PUBLIC"."payments" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_52" PRIMARY KEY("id");     
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.payments;

CREATE MEMORY TABLE "PUBLIC"."product_tag"(
    "product_id" VARCHAR_IGNORECASE(255) NOT NULL,
    "tag_id" VARCHAR_IGNORECASE(255) NOT NULL
);
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.product_tag;

CREATE MEMORY TABLE "PUBLIC"."products"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "available" BOOLEAN DEFAULT FALSE,
    "description" VARCHAR_IGNORECASE(255),
    "image" VARCHAR_IGNORECASE(255),
    "name" VARCHAR_IGNORECASE(255) NOT NULL,
    "price" DECIMAL(19, 2),
    "stock" VARCHAR_IGNORECASE(255)
);              
ALTER TABLE "PUBLIC"."products" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_C4" PRIMARY KEY("id");     
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.products;

CREATE MEMORY TABLE "PUBLIC"."shipments"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "achieve" BOOLEAN DEFAULT FALSE,
    "promise" TIMESTAMP
);    
ALTER TABLE "PUBLIC"."shipments" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_4" PRIMARY KEY("id");     
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.shipments;

CREATE MEMORY TABLE "PUBLIC"."suppliers"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "active" BOOLEAN DEFAULT FALSE,
    "email" VARCHAR_IGNORECASE(255) NOT NULL,
    "name" VARCHAR_IGNORECASE(255) NOT NULL,
    "phone" VARCHAR_IGNORECASE(255) NOT NULL
);     
ALTER TABLE "PUBLIC"."suppliers" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_FE" PRIMARY KEY("id");    
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.suppliers;

CREATE MEMORY TABLE "PUBLIC"."supplies"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "processed" BOOLEAN DEFAULT FALSE,
    "total" DECIMAL(19, 2),
    "supplier_id" VARCHAR_IGNORECASE(255) NOT NULL,
    "address_id" VARCHAR_IGNORECASE(255),
    "payment_id" VARCHAR_IGNORECASE(255),
    "shipment_id" VARCHAR_IGNORECASE(255)
);             
ALTER TABLE "PUBLIC"."supplies" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_9" PRIMARY KEY("id");      
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.supplies;

CREATE MEMORY TABLE "PUBLIC"."supply_item"(
    "supply_id" VARCHAR_IGNORECASE(255) NOT NULL,
    "item_id" VARCHAR_IGNORECASE(255) NOT NULL
);
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.supply_item;

CREATE MEMORY TABLE "PUBLIC"."tags"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "name" VARCHAR_IGNORECASE(255) NOT NULL
);          
ALTER TABLE "PUBLIC"."tags" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_36" PRIMARY KEY("id");         
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.tags;

CREATE MEMORY TABLE "PUBLIC"."user_address"(
    "user_id" VARCHAR_IGNORECASE(255) NOT NULL,
    "address_id" VARCHAR_IGNORECASE(255) NOT NULL
);              
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.user_address;

CREATE MEMORY TABLE "PUBLIC"."users"(
    "id" VARCHAR_IGNORECASE(255) NOT NULL,
    "registered" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "active" BOOLEAN DEFAULT FALSE,
    "email" VARCHAR_IGNORECASE(255) NOT NULL,
    "password" VARCHAR_IGNORECASE(255) NOT NULL,
    "username" VARCHAR_IGNORECASE(255) NOT NULL
);  
ALTER TABLE "PUBLIC"."users" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_6A" PRIMARY KEY("id");        
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.users;

ALTER TABLE "PUBLIC"."product_tag" ADD CONSTRAINT "PUBLIC"."UK_mkghhht2rh837xtjr4a7csjk8" UNIQUE("tag_id");    
ALTER TABLE "PUBLIC"."user_address" ADD CONSTRAINT "PUBLIC"."UK_m3t1qb7j0fluav2a0kphxyoue" UNIQUE("address_id");               
ALTER TABLE "PUBLIC"."supplies" ADD CONSTRAINT "PUBLIC"."FKp66w2r2km1wi31im8umgfp8ce" FOREIGN KEY("payment_id") REFERENCES "PUBLIC"."payments"("id") NOCHECK;  
ALTER TABLE "PUBLIC"."forwarder_shipment" ADD CONSTRAINT "PUBLIC"."FK4bd7cjjvadcjylubhdfugl5uk" FOREIGN KEY("shipment_id") REFERENCES "PUBLIC"."shipments"("id") NOCHECK;      
ALTER TABLE "PUBLIC"."forwarder_shipment" ADD CONSTRAINT "PUBLIC"."FKak2kihhfuxbm28vps88kqun12" FOREIGN KEY("forwarder_id") REFERENCES "PUBLIC"."forwarders"("id") NOCHECK;    
ALTER TABLE "PUBLIC"."cart_item" ADD CONSTRAINT "PUBLIC"."FKlqwuo55w1gm4779xcu3t4wnrd" FOREIGN KEY("cart_id") REFERENCES "PUBLIC"."carts"("id") NOCHECK;       
ALTER TABLE "PUBLIC"."items" ADD CONSTRAINT "PUBLIC"."FKmtk37pxnx7d5ck7fkq2xcna4i" FOREIGN KEY("product_id") REFERENCES "PUBLIC"."products"("id") NOCHECK;     
ALTER TABLE "PUBLIC"."orders" ADD CONSTRAINT "PUBLIC"."FK7ump3dhga2b2bsr1xa8d6tky4" FOREIGN KEY("card_id") REFERENCES "PUBLIC"."cards"("id") NOCHECK;          
ALTER TABLE "PUBLIC"."orders" ADD CONSTRAINT "PUBLIC"."FKsjfs85qf6vmcurlx43cnc16gy" FOREIGN KEY("customer_id") REFERENCES "PUBLIC"."users"("id") NOCHECK;      
ALTER TABLE "PUBLIC"."supplies" ADD CONSTRAINT "PUBLIC"."FK429kctm56wuny1wk9s325e19l" FOREIGN KEY("supplier_id") REFERENCES "PUBLIC"."suppliers"("id") NOCHECK;
ALTER TABLE "PUBLIC"."supply_item" ADD CONSTRAINT "PUBLIC"."FKbtgu7o76xhcx6qjx7hhc9og92" FOREIGN KEY("item_id") REFERENCES "PUBLIC"."items"("id") NOCHECK;     
ALTER TABLE "PUBLIC"."supply_item" ADD CONSTRAINT "PUBLIC"."FKmsur3h7o1y6bb5mp3rn7681nq" FOREIGN KEY("supply_id") REFERENCES "PUBLIC"."supplies"("id") NOCHECK;
ALTER TABLE "PUBLIC"."authorizations" ADD CONSTRAINT "PUBLIC"."FKmgstudfoflvxh8p05kacloejw" FOREIGN KEY("order_id") REFERENCES "PUBLIC"."orders"("id") NOCHECK;
ALTER TABLE "PUBLIC"."product_tag" ADD CONSTRAINT "PUBLIC"."FKgp9r9cogdtnjbwn6rw2dv0o00" FOREIGN KEY("tag_id") REFERENCES "PUBLIC"."tags"("id") NOCHECK;       
ALTER TABLE "PUBLIC"."carts" ADD CONSTRAINT "PUBLIC"."FKb5o626f86h46m4s7ms6ginnop" FOREIGN KEY("user_id") REFERENCES "PUBLIC"."users"("id") NOCHECK;           
ALTER TABLE "PUBLIC"."orders" ADD CONSTRAINT "PUBLIC"."FK8aol9f99s97mtyhij0tvfj41f" FOREIGN KEY("payment_id") REFERENCES "PUBLIC"."payments"("id") NOCHECK;    
ALTER TABLE "PUBLIC"."order_item" ADD CONSTRAINT "PUBLIC"."FKt4dc2r9nbvbujrljv3e23iibt" FOREIGN KEY("order_id") REFERENCES "PUBLIC"."orders"("id") NOCHECK;    
ALTER TABLE "PUBLIC"."orders" ADD CONSTRAINT "PUBLIC"."FKhlglkvf5i60dv6dn397ethgpt" FOREIGN KEY("address_id") REFERENCES "PUBLIC"."addresses"("id") NOCHECK;   
ALTER TABLE "PUBLIC"."cards" ADD CONSTRAINT "PUBLIC"."FKcmanafgwbibfijy2o5isfk3d5" FOREIGN KEY("user_id") REFERENCES "PUBLIC"."users"("id") NOCHECK;           
ALTER TABLE "PUBLIC"."cart_item" ADD CONSTRAINT "PUBLIC"."FKa775db7hxkc2s8utspc7tvh6g" FOREIGN KEY("item_id") REFERENCES "PUBLIC"."items"("id") NOCHECK;       
ALTER TABLE "PUBLIC"."user_address" ADD CONSTRAINT "PUBLIC"."FKrmincuqpi8m660j1c57xj7twr" FOREIGN KEY("user_id") REFERENCES "PUBLIC"."users"("id") NOCHECK;    
ALTER TABLE "PUBLIC"."orders" ADD CONSTRAINT "PUBLIC"."FK999el1skih1flvmhtej496ouh" FOREIGN KEY("shipment_id") REFERENCES "PUBLIC"."shipments"("id") NOCHECK;  
ALTER TABLE "PUBLIC"."supplies" ADD CONSTRAINT "PUBLIC"."FKp3a02a24taq2vrwt8ktei3qaa" FOREIGN KEY("address_id") REFERENCES "PUBLIC"."addresses"("id") NOCHECK; 
ALTER TABLE "PUBLIC"."order_item" ADD CONSTRAINT "PUBLIC"."FKo5d8io03ue2y89j3wbnju0let" FOREIGN KEY("item_id") REFERENCES "PUBLIC"."items"("id") NOCHECK;      
ALTER TABLE "PUBLIC"."product_tag" ADD CONSTRAINT "PUBLIC"."FKeybx0aj781vhg3j2wn8utdfvv" FOREIGN KEY("product_id") REFERENCES "PUBLIC"."products"("id") NOCHECK;               
ALTER TABLE "PUBLIC"."authorizations" ADD CONSTRAINT "PUBLIC"."FKiwsunnnj1xvlluaxshe2cm5ib" FOREIGN KEY("supply_id") REFERENCES "PUBLIC"."supplies"("id") NOCHECK;             
ALTER TABLE "PUBLIC"."user_address" ADD CONSTRAINT "PUBLIC"."FKpv7y2l6mvly37lngi3doarqhd" FOREIGN KEY("address_id") REFERENCES "PUBLIC"."addresses"("id") NOCHECK;             
ALTER TABLE "PUBLIC"."supplies" ADD CONSTRAINT "PUBLIC"."FKjntoujscel6i4npujivyeq7q" FOREIGN KEY("shipment_id") REFERENCES "PUBLIC"."shipments"("id") NOCHECK; 
