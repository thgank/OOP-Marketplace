PGDMP     6                     {            as3help    15.1    15.1 '    2           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            3           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            4           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            5           1262    16510    as3help    DATABASE        CREATE DATABASE as3help WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Russian_Kazakhstan.1251';
    DROP DATABASE as3help;
                postgres    false            �            1259    16566    Device    TABLE     �   CREATE TABLE public."Device" (
    id integer NOT NULL,
    brand character varying,
    model character varying,
    price double precision
);
    DROP TABLE public."Device";
       public         heap    postgres    false            �            1259    16590    BusinessTablet    TABLE     �   CREATE TABLE public."BusinessTablet" (
    fingerprint_scanner boolean NOT NULL,
    facial_recognition boolean,
    stylus_support boolean,
    keyboard_support boolean,
    screen_ratio character varying
)
INHERITS (public."Device");
 $   DROP TABLE public."BusinessTablet";
       public         heap    postgres    false    215            �            1259    16565    Device_id_seq    SEQUENCE     �   CREATE SEQUENCE public."Device_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public."Device_id_seq";
       public          postgres    false    215            6           0    0    Device_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public."Device_id_seq" OWNED BY public."Device".id;
          public          postgres    false    214            �            1259    16582    DrawingTablet    TABLE     �   CREATE TABLE public."DrawingTablet" (
    pressure_sensitivity integer NOT NULL,
    eraser boolean,
    stylus_support boolean,
    keyboard_support boolean,
    screen_ratio character varying
)
INHERITS (public."Device");
 #   DROP TABLE public."DrawingTablet";
       public         heap    postgres    false    215            �            1259    16574    GamingTablet    TABLE       CREATE TABLE public."GamingTablet" (
    gpu character varying NOT NULL,
    vr_support boolean,
    memory integer,
    ram integer,
    stylus_support boolean,
    keyboard_support boolean,
    screen_ratio character varying
)
INHERITS (public."Device");
 "   DROP TABLE public."GamingTablet";
       public         heap    postgres    false    215            �            1259    16606 
   Headphones    TABLE     �   CREATE TABLE public."Headphones" (
    type character varying,
    audio_quality character varying NOT NULL,
    noise_cancel boolean
)
INHERITS (public."Device");
     DROP TABLE public."Headphones";
       public         heap    postgres    false    215            �            1259    16598    MobilePhone    TABLE     �   CREATE TABLE public."MobilePhone" (
    ram integer,
    memory integer,
    screen_size character varying,
    camera character varying,
    dual_sim boolean NOT NULL
)
INHERITS (public."Device");
 !   DROP TABLE public."MobilePhone";
       public         heap    postgres    false    215            �            1259    16622 
   Smartphone    TABLE     �   CREATE TABLE public."Smartphone" (
    ram integer,
    memory integer,
    screen_size character varying,
    camera character varying,
    os character varying NOT NULL,
    face_id boolean,
    fingerprint_sensor boolean
)
INHERITS (public."Device");
     DROP TABLE public."Smartphone";
       public         heap    postgres    false    215            �            1259    16614 
   Smartwatch    TABLE     �   CREATE TABLE public."Smartwatch" (
    type character varying,
    operating_system character varying NOT NULL,
    fitness_tracker boolean,
    heart_rate boolean
)
INHERITS (public."Device");
     DROP TABLE public."Smartwatch";
       public         heap    postgres    false    215            �           2604    16593    BusinessTablet id    DEFAULT     r   ALTER TABLE ONLY public."BusinessTablet" ALTER COLUMN id SET DEFAULT nextval('public."Device_id_seq"'::regclass);
 B   ALTER TABLE public."BusinessTablet" ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    218            �           2604    16569 	   Device id    DEFAULT     j   ALTER TABLE ONLY public."Device" ALTER COLUMN id SET DEFAULT nextval('public."Device_id_seq"'::regclass);
 :   ALTER TABLE public."Device" ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    215    215            �           2604    16585    DrawingTablet id    DEFAULT     q   ALTER TABLE ONLY public."DrawingTablet" ALTER COLUMN id SET DEFAULT nextval('public."Device_id_seq"'::regclass);
 A   ALTER TABLE public."DrawingTablet" ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    217    214            �           2604    16577    GamingTablet id    DEFAULT     p   ALTER TABLE ONLY public."GamingTablet" ALTER COLUMN id SET DEFAULT nextval('public."Device_id_seq"'::regclass);
 @   ALTER TABLE public."GamingTablet" ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    216    214            �           2604    16609    Headphones id    DEFAULT     n   ALTER TABLE ONLY public."Headphones" ALTER COLUMN id SET DEFAULT nextval('public."Device_id_seq"'::regclass);
 >   ALTER TABLE public."Headphones" ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    220    214            �           2604    16601    MobilePhone id    DEFAULT     o   ALTER TABLE ONLY public."MobilePhone" ALTER COLUMN id SET DEFAULT nextval('public."Device_id_seq"'::regclass);
 ?   ALTER TABLE public."MobilePhone" ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    219            �           2604    16625    Smartphone id    DEFAULT     n   ALTER TABLE ONLY public."Smartphone" ALTER COLUMN id SET DEFAULT nextval('public."Device_id_seq"'::regclass);
 >   ALTER TABLE public."Smartphone" ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    222            �           2604    16617    Smartwatch id    DEFAULT     n   ALTER TABLE ONLY public."Smartwatch" ALTER COLUMN id SET DEFAULT nextval('public."Device_id_seq"'::regclass);
 >   ALTER TABLE public."Smartwatch" ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    221            +          0    16590    BusinessTablet 
   TABLE DATA           �   COPY public."BusinessTablet" (id, brand, model, price, fingerprint_scanner, facial_recognition, stylus_support, keyboard_support, screen_ratio) FROM stdin;
    public          postgres    false    218   //       (          0    16566    Device 
   TABLE DATA           ;   COPY public."Device" (id, brand, model, price) FROM stdin;
    public          postgres    false    215   L/       *          0    16582    DrawingTablet 
   TABLE DATA           �   COPY public."DrawingTablet" (id, brand, model, price, pressure_sensitivity, eraser, stylus_support, keyboard_support, screen_ratio) FROM stdin;
    public          postgres    false    217   i/       )          0    16574    GamingTablet 
   TABLE DATA           �   COPY public."GamingTablet" (id, brand, model, price, gpu, vr_support, memory, ram, stylus_support, keyboard_support, screen_ratio) FROM stdin;
    public          postgres    false    216   �/       -          0    16606 
   Headphones 
   TABLE DATA           b   COPY public."Headphones" (id, brand, model, price, type, audio_quality, noise_cancel) FROM stdin;
    public          postgres    false    220   �/       ,          0    16598    MobilePhone 
   TABLE DATA           l   COPY public."MobilePhone" (id, brand, model, price, ram, memory, screen_size, camera, dual_sim) FROM stdin;
    public          postgres    false    219   �/       /          0    16622 
   Smartphone 
   TABLE DATA           �   COPY public."Smartphone" (id, brand, model, price, ram, memory, screen_size, camera, os, face_id, fingerprint_sensor) FROM stdin;
    public          postgres    false    222   0       .          0    16614 
   Smartwatch 
   TABLE DATA           t   COPY public."Smartwatch" (id, brand, model, price, type, operating_system, fitness_tracker, heart_rate) FROM stdin;
    public          postgres    false    221   U0       7           0    0    Device_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public."Device_id_seq"', 13, true);
          public          postgres    false    214            �           2606    16597 "   BusinessTablet BusinessTablet_pkey 
   CONSTRAINT     u   ALTER TABLE ONLY public."BusinessTablet"
    ADD CONSTRAINT "BusinessTablet_pkey" PRIMARY KEY (fingerprint_scanner);
 P   ALTER TABLE ONLY public."BusinessTablet" DROP CONSTRAINT "BusinessTablet_pkey";
       public            postgres    false    218            �           2606    16573    Device Device_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public."Device"
    ADD CONSTRAINT "Device_pkey" PRIMARY KEY (id);
 @   ALTER TABLE ONLY public."Device" DROP CONSTRAINT "Device_pkey";
       public            postgres    false    215            �           2606    16589     DrawingTablet DrawingTablet_pkey 
   CONSTRAINT     t   ALTER TABLE ONLY public."DrawingTablet"
    ADD CONSTRAINT "DrawingTablet_pkey" PRIMARY KEY (pressure_sensitivity);
 N   ALTER TABLE ONLY public."DrawingTablet" DROP CONSTRAINT "DrawingTablet_pkey";
       public            postgres    false    217            �           2606    16581    GamingTablet GamingTablet_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public."GamingTablet"
    ADD CONSTRAINT "GamingTablet_pkey" PRIMARY KEY (gpu);
 L   ALTER TABLE ONLY public."GamingTablet" DROP CONSTRAINT "GamingTablet_pkey";
       public            postgres    false    216            �           2606    16613    Headphones Headphones_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public."Headphones"
    ADD CONSTRAINT "Headphones_pkey" PRIMARY KEY (audio_quality);
 H   ALTER TABLE ONLY public."Headphones" DROP CONSTRAINT "Headphones_pkey";
       public            postgres    false    220            �           2606    16605    MobilePhone MobilePhone_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public."MobilePhone"
    ADD CONSTRAINT "MobilePhone_pkey" PRIMARY KEY (dual_sim);
 J   ALTER TABLE ONLY public."MobilePhone" DROP CONSTRAINT "MobilePhone_pkey";
       public            postgres    false    219            �           2606    16629    Smartphone Smartphone_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public."Smartphone"
    ADD CONSTRAINT "Smartphone_pkey" PRIMARY KEY (os);
 H   ALTER TABLE ONLY public."Smartphone" DROP CONSTRAINT "Smartphone_pkey";
       public            postgres    false    222            �           2606    16621    Smartwatch Smartwatch_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public."Smartwatch"
    ADD CONSTRAINT "Smartwatch_pkey" PRIMARY KEY (operating_system);
 H   ALTER TABLE ONLY public."Smartwatch" DROP CONSTRAINT "Smartwatch_pkey";
       public            postgres    false    221            +      x������ � �      (      x������ � �      *      x������ � �      )      x������ � �      -   2   x�34�t,(�I�t�,
�O)�460��,J�I-.���L��,����� 
C�      ,      x������ � �      /   C   x�34�t,(�I��,���KU04�415760�4�44��4�3T��K��42�-����,�L����� ���      .      x������ � �     