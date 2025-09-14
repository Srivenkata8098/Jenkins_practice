package com.ecommerce.service;

import com.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Apple iPhone 15", "Latest iPhone with A17", 89999, "https://images.unsplash.com/photo-1693327630213-eb5a9b0f6f4a?w=800&q=80&auto=format&fit=crop"));
        list.add(new Product("Dell XPS 13", "13-inch laptop, 16GB RAM", 99990, "https://images.unsplash.com/photo-1517336714731-489689fd1ca8?w=800&q=80&auto=format&fit=crop"));
        list.add(new Product("Sony WH-1000XM5", "Noise-cancelling headphones", 25999, "https://images.unsplash.com/photo-1518444025159-4e0c4f6d5f2a?w=800&q=80&auto=format&fit=crop"));
        list.add(new Product("Travel Backpack", "Durable, water-resistant", 2799, "https://images.unsplash.com/photo-1526178610684-5a6b7d2b6d6d?w=800&q=80&auto=format&fit=crop"));
        list.add(new Product("Action Camera", "4K video, waterproof", 6500, "https://images.unsplash.com/photo-1503602642458-232111445657?w=800&q=80&auto=format&fit=crop"));
        list.add(new Product("Bluetooth Speaker", "Portable high-quality sound", 2200, "https://images.unsplash.com/photo-1518770660439-4636190af475?w=800&q=80&auto=format&fit=crop"));
        return list;
    }
}
